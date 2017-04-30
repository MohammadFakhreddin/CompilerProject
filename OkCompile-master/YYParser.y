
//  Extra imports are placed here
  %{
    import java.util.List;
    import java.io.*;
    import java.util.ArrayList;
  %}

/*
  Tokens
  Anything that is placed in lexer file as token
*/
%token <Eval> LETTER
%token <Eval> DIGIT
%token <Eval> NON_ZERO_DIGIT
%token <Eval> HASH_KW
%token <Eval> BOOL_KW
%token <Eval> WHITE_SPACE
%token <Eval> LETDIG
%token <Eval> ID_KW
%token <Eval> NUMCONST
%token <Eval> WITHOUT_N
%token <Eval> CHARCONST
%token <Eval> COMMENT
%token <Eval> REALCONST
%token <Eval> OR_KW
%token <Eval> AND_KW
%token <Eval> ELSE_KW
%token <Eval> THEN_KW
%token <Eval> NOT_KW
%token <Eval> IF_KW
%token <Eval> END_KW
%token <Eval> SWITCH_KW
%token <Eval> WHILE_KW
%token <Eval> CASE_KW
%token <Eval> DEFAULT_KW
%token <Eval> BREAK_KW
%token <Eval> REL_OP_KW
%token <Eval> MATH_OP_KW
%token <Eval> UNARY_MATH_OP_KW
%token <Eval> MATH_OP_ASSIGN_KW
%token <Eval> UNARY_OP_KW
%token <Eval> RETURN_KW
%token <Eval> RECORD_KW
%token <Eval> STATIC_KW
%token <Eval> TYPESPECIFIER_KW
%token <Eval> PUNC_KW
%token <Eval> ASSIGN_KW
%token <Eval> SEMI_COLUMN_KW
%token <Eval> LEFTAC RIGHTAC LEFTAR RIGHTAR COLUMN TWO_COLUMN LEFTPA RIGHTPA DOT_KW //"{" "}" "[" "]" "," ":" "(" ")" "."
%type <Eval> Rectype ID TypeSpecifier ScopedTypeSpecifer VarDeclId VarDeclList
%type <Eval> VarDeclInitialize ScopedVarDelaration VarDeclaration Constant
%type <Eval> Immutable Factor UnaryExpression MathLogicExpression ASSIGNED_MATH_OP
%type <Eval> Mutable Expression RelExpression SimpleExpression SelectionStmt
%type <Eval> Statement rightPaQ StatementList IfExpression M ItereationStmt OrElseRel
%type <Eval> AndThenRel N ParamId ParamList ParamIdList ParamTypeList Params FunPart
%type <Eval> FunDeclaration Combo ReturnStmt CompoundStmt CaseElement DefaultElement
%type <Eval> Call ArgList Args SwitchExpression BreakStmt RecDeclaration RecLocalDeclarations RecScopedVarDelaration
//Ineer class codes are places here
%code{
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static final String Arrstart = "start";
  public static final String Arrsize = "size";
  public static final String Arrindex = "index";

  public static String idVal,intVal,realVal,charVal,boolVal,mathOpVal,typeVal,unaryMathOpVal,unaryOpVal,mathOpAssignVal,relOpVal;
  private List<Quad> quadTable = new ArrayList();
  private SymbolTable symbolTable = new SymbolTable();
  private ScopeTable scopeTable = new ScopeTable(symbolTable);
  private CallTable callTable = new CallTable();
  private StructTable structTable = new StructTable();
  //emitMethod
  private void emit(String operation,String arg0,String arg1,String result)
  {
    quadTable.add(new Quad(operation,arg0,arg1,result));
    System.out.println(ANSI_PURPLE+"EMIT:"+operation+":"+arg0+":"+arg1+":"+result+ANSI_RESET);
  }

  private int tempCounter = 0;//newTempMethod
  private String newTemp(String type,boolean isArray,int size)
  {
    String name = "Temp"+(tempCounter++);
    emit(Eval.initOp,type,"",name);
    symbolTable.addToSymbolTable(name,type,isArray,size);
    return name;
  }

  private String newFunc(String funcName,String type)
  {
    String name = "Func"+funcName;
    symbolTable.addToSymbolTable(name,type,false,0);
    return name;
  }
  //backpatchMethod
  private void backpatch(ArrayList<Integer> list, int quadNumber) {
    for (int i = 0; i < list.size(); i++){
      if(quadTable.get(list.get(i)).operation.equals(Eval.assignOp)){
        quadTable.get(list.get(i)).arg0 = String.valueOf(quadNumber);
      }else{
        quadTable.get(list.get(i)).result = String.valueOf(quadNumber);
      }
    }
 }

 private void backpatch(ArrayList<Integer> list, String quadValue) {
   for (int i = 0; i < list.size(); i++){
     if(quadTable.get(list.get(i)).operation.equals(Eval.assignOp)){
       quadTable.get(list.get(i)).arg0 = quadValue;
     }else{
       quadTable.get(list.get(i)).result = quadValue;
     }
   }
}

 private void backpatch(int index, int quadNumber) {
    if(quadTable.get(index).operation.equals(Eval.assignOp)){
      quadTable.get(index).arg0 = String.valueOf(quadNumber);
    }else{
      quadTable.get(index).result = String.valueOf(quadNumber);
    }
 }

 private void setReturn(List<Integer>list,String result){
   for (int i = 0; i < list.size(); i++){
     quadTable.get(list.get(i)).result = result;
   }
 }
 //newQuadMethod
 private int nextQuad(){
   return quadTable.size();
 }
 //convertToTrueFalseIfPossibleMethod
 private String convertToTrueFalseIfPossible(String value)
 {
   if(value.equals(1+"")){
     value = "true";
   }else if(value.equals(0+"")) {
     value = "false";
   }
   return value;
 }

 private void writeFinalCode(String message)
 {
   message=message.replaceAll("#","");
   System.out.println(ANSI_YELLOW+message+ANSI_RESET);
 }
//generateCodeMethod
 private void generateCode()
 {
  String result = "";
  result = "#include<stdio.h>";
  System.out.println(ANSI_YELLOW+result+ANSI_RESET);
  result = "#include<iostream>";
  System.out.println(ANSI_YELLOW+result+ANSI_RESET);
  result = "#include<string>";
  System.out.println(ANSI_YELLOW+result+ANSI_RESET);
  result = "using namespace std;";
  System.out.println(ANSI_YELLOW+result+ANSI_RESET);
  List<StructTable.Record> structRecords = structTable.getAll();
  for(int i=0; i<structRecords.size();i++){
    result="struct "+ symbolTable.getByIndex(structRecords.get(i).symbolTableIndex).name+"{"; 
    writeFinalCode(result);
    StructTable.Record currentStruct= structRecords.get(i);
    for(int j=0 ; j < currentStruct.params.size(); j++){
      Quad current= currentStruct.params.get(j);
      if (current.operation.equals(Eval.constOp)) {
           result = "const "+current.arg0+" "+current.result+"="+current.arg1;

         }else if (current.operation.equals(Eval.initOp)) {
           SymbolTable.Record record=symbolTable.getSymbol(current.result);
           if(record.isArray==true){
            result = current.arg0+" "+current.result+"["+record.size+"]"+";";
            if(!current.arg1.equals("")){
                for(int p=0;p<record.size;p++){
                    result += "\n"+current.result+"["+p+"]"+"="+current.arg1+";";
                }
            }
             
            }else {
            result = current.arg0+" "+current.result+";";
            if(!current.arg1.equals("")){
              result += "\n"+current.result+"="+current.arg1+";";
            }
        }
       }
      writeFinalCode(result); 
       }
       result = "};";
       writeFinalCode(result);
    }
   result = "int top = 0;";
   writeFinalCode(result);
   result = "string globalStack[1024];";
   writeFinalCode(result);
   List<ScopeRecord> scopeRecords = scopeTable.getAll();
   for(int i=0;i<scopeRecords.size();i++){
      if(scopeRecords.get(i).returnType!=Eval.unknownType){
        result = scopeRecords.get(i).returnType+" "+scopeRecords.get(i).returnValue+";";      
        writeFinalCode(result);
      }
      String funcName = symbolTable.getByIndex(scopeRecords.get(i).symbolTableIndex).name;
      for(int j=scopeRecords.get(i).scopeStart;j<scopeRecords.get(i).scopeEnd;j++){
        if(j<0){
          continue;
        }
        SymbolTable.Record r=symbolTable.getByIndex(j);
        if(r.scope.equals("GLOBAL")||r.name.contains("Temp")){
          continue;
        }
        String newName = "L"+funcName+r.name;
        //for(int k=scopeRecords.get(i).emitStart;k<scopeRecords.get(i).emitEnd;k++){
        for(int k=scopeRecords.get(i).emitStart;k<scopeRecords.get(i).emitEnd;k++){
          Quad q = quadTable.get(k);
          // if(q.arg0.contains(funcName)
          //   ||q.arg1.contains(funcName)
          //   ||q.result.contains(funcName)
          //   // ||q.arg0.contains("Temp")
          //   // ||q.arg1.contains("Temp")
          //   // ||q.result.contains("Temp")
          //   )
          // {
          //   continue;
          // }
          if(q.arg0.contains(r.name) && !q.arg0.contains("Temp") && !q.arg0.contains(funcName)){
            q.arg0=q.arg0.replace(r.name,newName);
          }
          if(q.arg1.contains(r.name) && !q.arg1.contains("Temp") && !q.arg1.contains(funcName)){
            q.arg1=q.arg1.replace(r.name,newName);
          }
          if(q.result.contains(r.name)&& !q.result.contains("Temp") && !q.result.contains(funcName)){
            q.result=q.result.replace(r.name,newName);
          }
        }
        r.name = newName; 
      }
   }
   
   result = "int targetLine=0;";
   writeFinalCode(result);
   result = "int main(){";
   writeFinalCode(result);
   result = "goto Line0;";
   writeFinalCode(result);
   List<CallTable.Record> callRecords = callTable.getAll();
   for(int i=0;i<callRecords.size();i++){
      result = "Call"+i;
      result += ": if("+callRecords.get(i).name+"==targetLine) goto "+callRecords.get(i).value+";";
      writeFinalCode(result);
   }
    for (int i=0;i<quadTable.size();i++) {
       result = "Line"+i+":";
       Quad current = quadTable.get(i);
       if(current.operation.equals(Eval.castOP))
       {
         String type = "";
         if(current.arg1.equals(Eval.INT)){
           type = "int";
         }else if(current.arg1.equals(Eval.REAL)){
           type = "float";
         }else if (current.arg1.equals(Eval.CHAR)) {
           type = "char";
         }
         result += current.result+"="+"("+"("+type+")"+current.arg0+");";
       }else if(current.operation.equals(Eval.assignOp)){
         result += current.result+"="+current.arg0+";";
       }else if (current.operation.equals(Eval.assignOp)) {
         result += "const "+current.arg0+" "+current.result+"="+current.arg1;
       }else if(current.operation.equals(Eval.andOp)){
         result += current.result+"="+current.arg0+"&&"+current.arg1+";";
       }else if(current.operation.equals(Eval.orOp)){
         result += current.result+"="+current.arg0+"||"+current.arg1+";";
       }else if(current.operation.equals(Eval.notOp)){
         result += current.result+"="+"!"+current.arg0+";";
      //  }else if (current.operation.equals(Eval.returnOp)) {
      //    result += "return "+current.result+";";
       }else if (current.operation.equals(Eval.initOp)) {
         SymbolTable.Record record=symbolTable.getSymbol(current.result);
         // if(record.isArray==true){
         //   if(current.arg1.equals("")){
         //      result += current.arg0+" "+current.result+"["+record.size+"]"+";";
         //    }else{
         //      result += current.arg0+" "+current.result+"["+record.size+"]"+"="+current.arg1+";";
         //    }
         // }else {
         //  if(current.arg1.equals("")){
         //   result += current.arg0+" "+current.result+";";
         //  }else {
         //   result += current.arg0+" "+current.result+"="+current.arg1+";";
         //  }
         // }
         if(record.isArray==true){
            result += current.arg0+" "+current.result+"["+record.size+"]"+";";
            if(!current.arg1.equals("")){
                for(int k=0;k<record.size;k++){
                    result += "\n"+current.result+"["+k+"]"+"="+current.arg1+";";
                }
            }
        }else {
          result += current.arg0+" "+current.result+";";
          if(!current.arg1.equals("")){
            result += "\n"+current.result+"="+current.arg1+";";
          }
        }
       }else if (current.operation.equals(Eval.ifOp)) {
          result += "if("+current.arg0+")"+"goto Line"+current.result+";";
       }else if (current.operation.equals(Eval.gotoOp)) {
          result += "goto "+"Line"+current.result+";";
       }else if(current.operation.equals(Eval.variableGotoOp)){
         result += "goto "+current.result+";";
       }else if (current.operation.equals(Eval.stackPop)) {
          result+="top = top -1;\n";
          result += current.result;
         //result+="=globalStack.pop();";
          if(current.arg0==Eval.INT){
            result+="=stoi(globalStack[top]);";
          }else if(current.arg0==Eval.CHAR){
            result+="=stoc(globalStack[top]);";
          }else if(current.arg0==Eval.REAL){
            result+="stof(globalStack[top]);";
          }else if(current.arg0==Eval.BOOL){
            result+="=stoi(globalStack[top]);";
          }
       }else if (current.operation.equals(Eval.stackPush)) {
       //  result+="globalStack.push("+current.result+");";
          result+="globalStack[top]="+current.result+";\ntop = top+1;";
       }else{
         boolean isUsed = false;
         for (int k=0;k<Eval.mathOpList.length;k++) {
            if(current.operation.equals(Eval.mathOpList[k])){
              isUsed = true;
              result += current.result+"="+current.arg0+current.operation+current.arg1+";";
              break;
            }
         }
         if(isUsed){
           writeFinalCode(result);
           continue;
         }
         for (int k=0;k<Eval.unaryMathOPList.length;k++) {
            if(current.operation.equals(Eval.unaryMathOPList[k])){
              isUsed = true;
              result += current.result+"="+current.result+current.operation+";";
              break;
            }
         }
         if(isUsed){
           writeFinalCode(result);
           continue;
         }
         for (int k=0;k<Eval.mathOpAssignList.length;k++) {
            if(current.operation.equals(Eval.mathOpAssignList[k])){
              isUsed = true;
              result += current.result+current.operation+current.arg0+";";
              break;
            }
         }
         if(isUsed){
           writeFinalCode(result);
           continue;
         }
         for (int k=0;k<Eval.uniryOpList.length;k++) {
            if(current.operation.equals(Eval.uniryOpList[k])){
              isUsed = true;
              result += current.result+"="+current.operation+current.arg0+";";
              break;
            }
         }
         for (int k=0;k<Eval.relopOpList.length;k++) {
            if(current.operation.equals(Eval.relopOpList[k])){
              isUsed = true;
              String operation = "";
              if(Eval.relopOpList[k].equals(".le")){
                operation = "<=";
              }else if(Eval.relopOpList[k].equals(".lt")) {
                operation = "<";
              }else if (Eval.relopOpList[k].equals(".gt")) {
                operation = ">";
              }else if (Eval.relopOpList[k].equals(".ge")) {
                operation = ">=";
              }else if (Eval.relopOpList[k].equals(".eq")) {
                operation = "==";
              }else if (Eval.relopOpList[k].equals(".ne")) {
                operation = "!=";
              }else {
                System.out.println(ANSI_RED+"Error:Relop not found for "+current.operation+ANSI_RESET);
               }
              result += "if("+current.arg0+operation+current.arg1+")"+current.result+"=true;\n";
              result += "else "+current.result+"=false;";
              break;
            }
         }
         if(!isUsed)
         {
           System.out.println(ANSI_RED+"Error:OpCode not found for "+current.operation+ANSI_RESET);
         }
      }
     writeFinalCode(result);
   }
    result = "Line"+quadTable.size()+":return 0;\n}";
    writeFinalCode(result);
 }

}

//Associatives must be placed here
%left OR_KW
%left AND_KW
%right NOT
%left THEN_KW
%right "simpleOr"
%right "simpleAnd"
%right "andThen"
%right "orElse"
%nonassoc "then"
%nonassoc ELSE_KW
%left "oneCase"
%left "manyCase"

%%
//Grammer code part must be place here
  Program : DeclarationList {
    System.out.println("Program  :  {DeclarationList}");
    generateCode();
  };
  DeclarationList : DeclarationList Declaration {
    System.out.println("DeclarationList : DeclarationList Declaration");
  };
    | Declaration  {
      System.out.println("DeclarationList :  Declaration");
  };
  Declaration : VarDeclaration {
    System.out.println("Declaration : VarDeclaration");   
    // List<ScopeRecord> scopeRecordList=scopeTable.getAll();
    // int start = 0;
    // if(scopeRecordList.size()>0){
    //   ScopeRecord scopeRecord = scopeRecordList.get(scopeRecordList.size()-1);
    //   start = scopeRecord.scopeEnd;
    // }
    // int end = symbolTable.getSize();
    // for(int i=start;i<end;i++){
    //   if(i<0){
    //     continue;
    //   }
    //   SymbolTable.Record r=symbolTable.getByIndex(i);
    //   r.scope = "GLOBAL";
    // }
  };
    | FunDeclaration {
      System.out.println("Declaration : FunDeclaration");

    };
    | RecDeclaration {System.out.println("Declaration : RecDeclaration");};

  VarDeclaration :  TypeSpecifier  VarDeclList SEMI_COLUMN_KW {
    System.out.println("ScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = $2.typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = $1.type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
              symbolTable.getByIndex(index).scope="GLOBAL";
              if( typeInitList.get(i).defaultInit!= null ){
                if(typeInitList.get(i).defaultInit.type.equals($1.type)){
                  //emit(Eval.assignOp,typeInitList.get(i).defaultInit.place,"",typeInitList.get(i).place);
                  emit(Eval.initOp,$1.type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place);
                }else {
                  System.out.println("Error:MisMatch Type initilizer");
                  break;
                }
              }else{
                emit(Eval.initOp,$1.type,"",typeInitList.get(i).place);
              }
              System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }

  };

  // RecDeclaration : RECORD_KW Rectype LEFTAC LocalDeclarations RIGHTAC {
  //   System.out.println("RecDeclaration : record ID { LocalDeclarations }");
  RecDeclaration : RECORD_KW Rectype LEFTAC RecLocalDeclarations RIGHTAC {
    System.out.println("RecDeclaration : record ID { LocalDeclarations }");
    $$ = new Eval();
    symbolTable.addToSymbolTable($2.place,Eval.rectype,$2.isArray,$2.size);
    structTable.addnewStruct(symbolTable.getSize()-1,$4.structList);
  };
  |RECORD_KW Rectype LEFTAC  RIGHTAC {
    System.out.println("RecDeclaration : record ID { lambda }");
    symbolTable.addToSymbolTable($2.place,Eval.rectype,$2.isArray,$2.size);
    structTable.addnewStruct(symbolTable.getSize()-1,((Eval)$$).structList);
  };

  RecLocalDeclarations :RecLocalDeclarations  RecScopedVarDelaration{
    System.out.println("RecLocalDeclarations :  RecLocalDeclarations  RecScopedVarDelaration");
    $$ = new Eval();
    ((Eval)$$).structList= $1.structList; 
  ((Eval)$$).structList.addAll($2.structList);

  };//Original
  |RecScopedVarDelaration {
    System.out.println("RecLocalDeclarations : RecScopedVarDelaration");
  $$ = new Eval();
    ((Eval)$$).structList= $1.structList;   
  };

  RecScopedVarDelaration:   ScopedTypeSpecifer  VarDeclList SEMI_COLUMN_KW {
    System.out.println("RecScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = $2.typeInitList;
    $$ = new Eval();
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = $1.type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                if($1.place.equals("const")){
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals($1.type)){
                      ((Eval)$$).structList.add(new Quad(Eval.constOp,$1.type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place));
                        // emit(Eval.constOp,$1.type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place);
                    }else {
                      System.out.println(ANSI_RED+"Error:MisMatch Type initilizer"+ANSI_RESET);
                      break;
                    }
                  }else {//TODO We need to check if variable is static or not
                    System.out.println(ANSI_RED+"Error:Static varibales must have intial value"+ANSI_RESET);
                  }
                }else {
                  // emit(Eval.initOp,$1.type,"",typeInitList.get(i).place);
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals($1.type)){
                      // emit(Eval.assignOp,typeInitList.get(i).defaultInit.place,"",typeInitList.get(i).place);
                    ((Eval)$$).structList.add(new Quad(Eval.initOp,$1.type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place)); 
                    }else {
                      System.out.println("Error:MisMatch Type initilizer");
                      break;
                    }
                  }else
                  {
                    ((Eval)$$).structList.add(new Quad(Eval.initOp,$1.type,"",typeInitList.get(i).place));  
                  }
                }
                System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }

  };

  ScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList SEMI_COLUMN_KW {
    System.out.println("ScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = $2.typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = $1.type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                if($1.place.equals("const")){
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals($1.type)){
                      emit(Eval.constOp,$1.type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place);
                    }else {
                      System.out.println(ANSI_RED+"Error:MisMatch Type initilizer"+ANSI_RESET);
                      break;
                    }
                  }else {//TODO We need to check if variable is static or not
                    System.out.println(ANSI_RED+"Error:Static varibales must have intial value"+ANSI_RESET);
                  }
                }else {
                  emit(Eval.initOp,$1.type,"",typeInitList.get(i).place);
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals($1.type)){
                      emit(Eval.assignOp,typeInitList.get(i).defaultInit.place,"",typeInitList.get(i).place);
                    }else {
                      System.out.println("Error:MisMatch Type initilizer");
                      break;
                    }
                  }
                }
                System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }

  };

  VarDeclList :  VarDeclList COLUMN VarDeclInitialize {
      System.out.println("VarDeclList :  VarDeclList , VarDeclInitialize");
      $$ = new Eval();
      ((Eval)$$).type = $3.type;
      //((Eval)$$).isArray = false;
      ((Eval)$$).typeInitList = $1.typeInitList;
      ((Eval)$$).typeInitList.add($3);
    };
    | VarDeclInitialize {
      System.out.println("VarDeclList : VarDeclInitialize");
      $$ = new Eval();
      ((Eval)$$).type = $1.type;
      //((Eval)$$).isArray = false;
      ((Eval)$$).typeInitList.add($1);
};

  VarDeclInitialize :  VarDeclId {
      System.out.println("VarDeclInitialize :  VarDeclId");
      $$ = new Eval();
      ((Eval)$$).place = $1.place;
      ((Eval)$$).isArray = $1.isArray;
      ((Eval)$$).type = $1.type;
      ((Eval)$$).size = $1.size;
    };
    | VarDeclId TWO_COLUMN SimpleExpression {
      System.out.println("VarDeclInitialize :  VarDeclId : SimpleExpression");
      $$ = new Eval();
      ((Eval)$$).place = $1.place;
      ((Eval)$$).isArray = $1.isArray;
      ((Eval)$$).type = $1.type;
      ((Eval)$$).size = $1.size;
      ((Eval)$$).defaultInit=$3;
    };


  VarDeclId :  ID {
        System.out.println("VarDeclId :  ID");
        $$ = new Eval();
        ((Eval)$$).place = $1.place;
        ((Eval)$$).isArray = false;
        ((Eval)$$).type = Eval.unknownType;
      };
    | ID LEFTAR NUMCONST RIGHTAR {
        System.out.println("VarDeclId :  ID [ NUMCONST ]");
        $$ = new Eval();
        ((Eval)$$).place = $1.place;
        ((Eval)$$).isArray = true;
        ((Eval)$$).type = Eval.unknownType;
        ((Eval)$$).size = Integer.parseInt(intVal.replaceAll(" ",""));
      };

  ScopedTypeSpecifer : STATIC_KW TypeSpecifier {//TODO We need to do something about
    System.out.println("ScopedTypeSpecifer : static TypeSpecifier");
    $$ = new Eval();//TODO
    ((Eval)$$).isArray = $2.isArray;
    ((Eval)$$).type = $2.type;
    ((Eval)$$).place = "const";
  };
  | TypeSpecifier {
    System.out.println("ScopedTypeSpecifer : TypeSpecifier");
    $$ = new Eval();
    ((Eval)$$).isArray = $1.isArray;
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
  };

  TypeSpecifier :  TYPESPECIFIER_KW {
    System.out.println("TypeSpecifier :  ReturnTypeSpecifer");
    $$ = new Eval();
    ((Eval)$$).isArray = false;
    //$$.type = typeVal;
    if(typeVal.equals("int")){
        ((Eval)$$).type = Eval.INT;
    }else if(typeVal.equals("real")){
        ((Eval)$$).type = Eval.REAL;
    }else if(typeVal.equals("bool")){
        ((Eval)$$).type = Eval.BOOL;
    }else if(typeVal.equals("char")){
        ((Eval)$$).type = Eval.CHAR;
    }
    ((Eval)$$).place = "";
  };
  |Rectype {
    System.out.println("TypeSpecifier :  Rectype");
    $$ = new Eval();
    ((Eval)$$).isArray = false;
    ((Eval)$$).type = $1.place;
    ((Eval)$$).place ="";//$1.place;
  };

  Rectype : ID {
    System.out.println("Rectype : ID");
    $$ = new Eval();
    ((Eval)$$).isArray = false;
    ((Eval)$$).type =  Eval.rectype;
    ((Eval)$$).place = $1.place;
  };

  //FunDeclaration :  TypeSpecifier  ID LEFTPA Params rightPaQ  Statement {System.out.println("FunDeclaration :  TypeSpecifier  ID ( Params ) Statement");};
  //| ID LEFTPA Params rightPaQ Statement {System.out.println("FunDeclaration :   ID ( Params ) Statement");};
  FunDeclaration : FunPart Statement N {
    $$ = new Eval();
    symbolTable.addToSymbolTable($1.place,Eval.Func,false,0);
    scopeTable.addNewScope(symbolTable.getSize()-1,$1.symbolTableQuad,$3.symbolTableQuad,$1.quad,nextQuad(),$1.nextList,$1.returnName,$1.type,($1.endOfFuncWaitingGoto+1)+"");
//    private void backpatch(ArrayList<Integer> list, int quadNumber) {
    if($1.endOfFuncWaitingGoto>=0){
      backpatch($1.endOfFuncWaitingGoto,nextQuad());
    }
    if(!$1.type.equals(Eval.unknownType)){
      setReturn($2.returnList,$1.returnName);
    }
    backpatch($2.nextList,$1.place2);//It is where end of func must go
    //backpatch($2.nextList,"Call0");//It is where end of func must go
    for(int j=$1.symbolTableQuad;j<$3.symbolTableQuad;j++){
        if(j<0){
          continue;
        }
        SymbolTable.Record r=symbolTable.getByIndex(j);
        if(r.type!=Eval.Func
          && r.type!=Eval.rectype){
          if(r.scope.equals("")){
            r.scope = $1.place;
          }
        }
    } 
  }

  FunPart : TypeSpecifier   ID LEFTPA  Params rightPaQ {//TODO We need to check for return Statement
    System.out.println("FunDeclaration :  TypeSpecifier  ID ( Params ) Statement");
    $$ = new Eval();
    if(!$2.place.equals("#aa11")){
      emit(Eval.gotoOp,"","","");
      ((Eval)$$).endOfFuncWaitingGoto = nextQuad()-1;
    }else
    {
      ((Eval)$$).endOfFuncWaitingGoto = -1;
    }
    int emitStart = nextQuad();
    int symbolTableQuad = symbolTable.getSize()-$4.nextList.size()-1; 
    for(int i=0;i<$4.nextList.size();i++){
      SymbolTable.Record r=symbolTable.getByIndex($4.nextList.get(i));
      emit(Eval.initOp,r.type,"",r.name);
      emit(Eval.stackPop,r.type,"",r.name);
    }
    String funcReturn = newFunc($2.place,$1.type);
    //String temp = newTemp(Eval.STRING,false,0);
    //emit(Eval.assignOp,"","",funcReturn);
    String temp2 = "0";
    if(!$2.place.equals("#aa11")){
      temp2 = newTemp(Eval.INT,false,0);
      emit(Eval.stackPop,Eval.INT,false+"",temp2);
    }
    ((Eval)$$).place2 = temp2;//It is where end of func most go
    ((Eval)$$).symbolTableQuad = symbolTableQuad;//For scope
    ((Eval)$$).quad = emitStart;//For scope
    ((Eval)$$).type = $1.type;//It is where it must set values as return
    ((Eval)$$).nextList = $4.nextList;
    ((Eval)$$).place = $2.place;
    ((Eval)$$).returnName = funcReturn;
  };
  | ID LEFTPA Params N rightPaQ{
    System.out.println("FunDeclaration :   ID ( Params ) Statement");
    $$ = new Eval();
    if(!$1.place.equals("#aa11")){
      emit(Eval.gotoOp,"","","");
      ((Eval)$$).endOfFuncWaitingGoto = nextQuad()-1;
    }else
    {
      ((Eval)$$).endOfFuncWaitingGoto = -1;
    }
    for(int i=0;i<$3.nextList.size();i++){
      SymbolTable.Record r=symbolTable.getByIndex($3.nextList.get(i));
      emit(Eval.initOp,r.type,"",r.name);
      emit(Eval.stackPop,r.type,"",r.name);
    }
    // private String newTemp(String type,boolean isArray,int size)
    String temp = "0";
    if(!$1.place.equals("#aa11")){
      temp = newTemp(Eval.INT,false,0);
      emit(Eval.stackPop,Eval.INT,false+"",temp);
    }
    ((Eval)$$).place2 = temp;//It is where end of func most go
    ((Eval)$$).quad = $4.quad;
    ((Eval)$$).symbolTableQuad = $4.symbolTableQuad-$3.nextList.size()-1;
    ((Eval)$$).type = Eval.unknownType;//It is where it must set values as return
    ((Eval)$$).nextList = $3.nextList;
    ((Eval)$$).place = $1.place;
  };

  Params :  ParamList {
    System.out.println("Params :  ParamList ");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
  };
  |{
    System.out.println("Params : lambda");
    $$ = new Eval();
  };

  ParamList :  ParamList SEMI_COLUMN_KW ParamTypeList {
    System.out.println("ParamList :  ParamList ; ParamTypeList");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).nextList.addAll($3.nextList);
  };
  | ParamTypeList {
    System.out.println("ParamList :  ParamTypeList");
    $$ = new Eval();
    ((Eval)$$).nextList.addAll($1.nextList);
  };

  ParamTypeList :  TypeSpecifier  ParamIdList {
    System.out.println("ParamTypeList :  TypeSpecifier  ParamIdList");
    $$ = new Eval();
    List<Eval> typeInitList = $2.typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = $1.type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
                ((Eval)$$).nextList.add(index);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }
  };

  ParamIdList :  ParamIdList COLUMN ParamId {
    System.out.println("ParamIdList :  ParamIdList , ParamId");
    $$ = new Eval();
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
    ((Eval)$$).type = Eval.unknownType;
    ((Eval)$$).typeInitList = $1.typeInitList;
    ((Eval)$$).typeInitList.add($3);
  };
  | ParamId {
    System.out.println("ParamIdList :  ParamId");
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
    ((Eval)$$).type = Eval.unknownType;
    ((Eval)$$).typeInitList.add($1);
  };

  ParamId :  ID {
    $$ = new Eval();
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = false;
    ((Eval)$$).type = Eval.unknownType;
    System.out.println("ParamId :  ID");
  };
  | ID LEFTAR RIGHTAR {
    System.out.println("ParamId :  ID []");
    $$ = new Eval();
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = true;
    ((Eval)$$).type = Eval.unknownType;
    ((Eval)$$).size = -1;
    ((Eval)$$).typeInitList = new ArrayList<>();
  };

  Statement :  ExpressionStmt {
    System.out.println("Statement :  ExpressionStmt");
    $$ = new Eval();
  };
  | CompoundStmt {
    System.out.println("Statement :  CompoundStmt");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).returnList = $1.returnList;
    ((Eval)$$).breakList = $1.breakList;
  };
  |SelectionStmt{
    System.out.println("Statement :  SelectionStmt");
    $$ = new Eval();
    ((Eval)$$).breakList = $1.breakList;

    //((Eval)$$).nextList = $1.nextList;
  };
  | ItereationStmt {
    System.out.println("Statement :  ItereationStmt");
    $$ = new Eval();
    
  };
  | ReturnStmt {
    System.out.println("Statement :  ReturnStmt");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).returnList = $1.returnList;
  };
  | BreakStmt {
    System.out.println("Statement : BreakStmt");
    $$ = new Eval();
    ((Eval)$$).breakList = $1.breakList;
  };

  CompoundStmt :LEFTAC  RIGHTAC  {
    System.out.println("{ LEFTAC  RIGHTAC }");
    $$ = new Eval();
  };
  |LEFTAC Combo RIGHTAC {
    System.out.println("{ LocalDeclarations  StatementList }");
    $$ = new Eval();
    ((Eval)$$).nextList = $2.nextList;
    ((Eval)$$).returnList = $2.returnList;
    ((Eval)$$).breakList = $2.breakList;
  };

  Combo : LocalDeclarations StatementList
  {
    $$ = new Eval();
    ((Eval)$$).nextList = $2.nextList;
    ((Eval)$$).returnList = $2.returnList;
    ((Eval)$$).breakList = $2.breakList;
  }
  |StatementList
  {
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).returnList = $1.returnList;
    ((Eval)$$).breakList = $1.breakList;
  }
  |LocalDeclarations
  {
    $$ = new Eval();
  }

  LocalDeclarations :LocalDeclarations  ScopedVarDelaration{System.out.println("LocalDeclarations :  LocalDeclarations  ScopedVarDelaration");};//Original
  |ScopedVarDelaration {System.out.println("LocalDeclarations : ScopedVarDelaration");}

  StatementList :  StatementList  Statement {
    System.out.println("StatementList :  StatementList  Statement");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).nextList=Eval.merge(((Eval)$$).nextList,$2.nextList);
    ((Eval)$$).returnList = $1.returnList;
    ((Eval)$$).returnList=Eval.merge(((Eval)$$).returnList,$2.returnList);
	((Eval)$$).breakList=$1.breakList;
	((Eval)$$).breakList=Eval.merge(((Eval)$$).breakList,$2.breakList);
  };
  |Statement{
    System.out.println("StatementList : Statement");
    $$ = new Eval();
    ((Eval)$$).nextList = $1.nextList;
    ((Eval)$$).returnList = $1.returnList;
    ((Eval)$$).breakList=$1.breakList;
  };

  ExpressionStmt :  Expression SEMI_COLUMN_KW{System.out.println("ExpressionStmt :  Expression ;");};
  |SEMI_COLUMN_KW {System.out.println(";");};

  SelectionStmt :   IF_KW  LEFTPA IfExpression rightPaQ  Statement   %prec "then" {
    System.out.println(" SelectionStmt :   IF_KW  ( SimpleExpression ) Statement ");
    backpatch($3.trueList,$4.quad);
    backpatch($3.falseList,nextQuad());
    $$ = new Eval();
    ((Eval)$$).breakList=$5.breakList;
    // ((Eval)$$).nextList = new ArrayList<>();
    // ((Eval)$$).nextList.add(nextQuad()-1);
    // ((Eval)$$).nextList = Eval.merge(((Eval)$$).nextList,null);
  };
  |  IF_KW  LEFTPA IfExpression rightPaQ Statement   ELSE_KW M Statement {
    System.out.println("SelectionStmt :  IF_KW  ( SimpleExpression ) Statement   ELSE_KW   Statement");
    backpatch($3.trueList,$4.quad);
    backpatch($3.falseList,$7.quad);
    $$ = new Eval();
    ((Eval)$$).breakList=$5.breakList;
  };
  |  SWITCH_KW  LEFTPA SwitchExpression rightPaQ CaseElement M DefaultElement  END_KW M  {
    System.out.println("SelectionStmt :  SWITCH_KW   ( SimpleExpression ) CaseElement  DefaultElement   END_KW  ");
       $$ = new Eval();
    int lastCase =$5.declaredCases.size() - 1;
    ((Eval)$$).place = newTemp(Eval.unknownType,false,0);
    backpatch($3.falseList,$9.quad);
    
    String temp= newTemp(Eval.BOOL,false,0);
    for(int i = 0; i < $5.declaredCases.size() - 1; i++) {
      // private String newTemp(String type,boolean isArray,int size)
      emit(".eq",$3.place,$5.declaredCases.get(i).place,temp);
      emit(Eval.ifOp, temp, "",$5.trueList.get(i)+"");
      // backpatch($6.declaredCases.get(i).breakList,($9.quad));
    }
    
    emit(".eq",$3.place,$5.declaredCases.get(lastCase).place,((Eval)$$).place);
    emit(Eval.ifOp, ((Eval)$$).place, "", $5.trueList.get(lastCase)+""); // result will not be backpatched.
    
    ((Eval)$$).nextList=Eval.merge($5.nextList,$7.nextList);
    emit(Eval.gotoOp,"","",$7.trueList.get(0)+"");
    backpatch(((Eval)$$).nextList,nextQuad());


  };
  |SWITCH_KW END_KW  {
    System.out.println("SelectionStmt :  SWITCH_KW  END_KW  ");

  };

  SwitchExpression : SimpleExpression{
      $$ = new Eval();
      ((Eval)$$).place = $1.place;
      ((Eval)$$).isArray = $1.isArray;
      ((Eval)$$).type = $1.type;
      emit(Eval.gotoOp,"","","");
      ((Eval)$$).falseList = new ArrayList<>();
      ((Eval)$$).falseList.add(nextQuad()-1);      
}

  IfExpression : SimpleExpression{
      $$ = new Eval();
      ((Eval)$$).place = $1.place;
      ((Eval)$$).isArray = $1.isArray;
      ((Eval)$$).type = $1.type;
      emit(Eval.ifOp,$1.place,"","");
      emit(Eval.gotoOp,"","","");
      ((Eval)$$).trueList = new ArrayList<>();
      ((Eval)$$).falseList = new ArrayList<>();
      ((Eval)$$).trueList.add(nextQuad()-2);
      ((Eval)$$).falseList.add(nextQuad()-1);
  }

  CaseElement :   CASE_KW  M Constant TWO_COLUMN M Statement SEMI_COLUMN_KW M %prec "oneCase"{
    System.out.println("CaseElement :   CASE_KW    NUMCONST : Statement ;");
      $$ = new Eval();
      ((Eval)$$).declaredCases= new ArrayList<>();
      ((Eval)$$).declaredCases.add($3);
      ((Eval)$$).trueList=Eval.makeList($5.quad);
      ((Eval)$$).falseList=Eval.makeList($8.quad);
      ((Eval)$$).caseStartPoint=Eval.makeList($2.quad);
      ((Eval)$$).nextList=Eval.makeList($8.quad);
      emit(Eval.gotoOp,"","",((Eval)$$).nextList+"");
      ((Eval)$$).breakList=$6.breakList;
  };
  |CaseElement CASE_KW M Constant TWO_COLUMN M Statement SEMI_COLUMN_KW M%prec "oneCase"{
    System.out.println("CaseElement : CaseElement  CASE_KW    NUMCONST : Statement ;");
    $$ = new Eval();
      ((Eval)$$).declaredCases = $1.declaredCases;
      ((Eval)$$).declaredCases.add($4);
      ((Eval)$$).trueList = $1.trueList;
      ((Eval)$$).trueList.add($6.quad);
      ((Eval)$$).falseList=$1.falseList;
      ((Eval)$$).falseList.add($9.quad);
      ((Eval)$$).caseStartPoint=$1.caseStartPoint;
      ((Eval)$$).caseStartPoint.add($3.quad);
      ((Eval)$$).nextList=$1.nextList;
      ((Eval)$$).nextList.add($9.quad);
      emit(Eval.gotoOp,"","",((Eval)$$).nextList+"");
      ((Eval)$$).breakList=$1.breakList;  
	  ((Eval)$$).breakList=Eval.merge(((Eval)$$).breakList,$7.breakList);

  };

  DefaultElement :   DEFAULT_KW   TWO_COLUMN M Statement SEMI_COLUMN_KW M{
    System.out.println("DefaultElement :   DEFAULT_KW   : Statement ;");
    $$ = new Eval();  
    ((Eval)$$).trueList=Eval.makeList($3.quad);
    emit(Eval.gotoOp,"","",((Eval)$$).trueList+"");
    ((Eval)$$).nextList=Eval.makeList($6.quad);
    emit(Eval.gotoOp,"","",((Eval)$$).nextList+"");
    ((Eval)$$).breakList=$4.breakList;  
  };

  |{System.out.println("DefaultElement : lambda");};

 
  ItereationStmt :   WHILE_KW LEFTPA M IfExpression rightPaQ Statement M
  {
    System.out.println("ItereationStmt :   WHILE_KW   ( SimpleExpression ) Statement");
    $$ = new Eval();
    emit(Eval.gotoOp,"","",$3.quad+"");
    backpatch($4.falseList,($7.quad+1));
    backpatch($4.trueList,$5.quad);
    backpatch($6.breakList,($7.quad+1));

  };

  ReturnStmt :  RETURN_KW SEMI_COLUMN_KW {
    System.out.println("ReturnStmt :  RETURN_KW ;");
    //emit(Eval.gotoOp,"","","");
    $$ = new Eval();
    emit(Eval.assignOp,"","","targetLine");
    emit(Eval.variableGotoOp,"","","Call0");
    //((Eval)$$).nextList.add(nextQuad()-1);
    ((Eval)$$).nextList.add(nextQuad()-2);
  };
  | RETURN_KW  Expression SEMI_COLUMN_KW {
    System.out.println("ReturnStmt :  RETURN_KW  Expression ;");
    $$ = new Eval();
    emit(Eval.assignOp,$2.place,"","");//Assinment is : *arg1.place = result.place
    emit(Eval.assignOp,"","","targetLine");
    emit(Eval.variableGotoOp,"","","Call0");
    ((Eval)$$).returnList.add(nextQuad()-3);
    ((Eval)$$).nextList.add(nextQuad()-2);
    //((Eval)$$).nextList.add(nextQuad()-1);

  };

  BreakStmt :   BREAK_KW   SEMI_COLUMN_KW {
     System.out.println("BreakStmt :   BREAK_KW   ;");
    $$ = new Eval();
    emit(Eval.gotoOp,"","","");
    ((Eval)$$).breakList= Eval.makeList(nextQuad()-1);

  };

  Expression  :   Mutable ASSIGN_KW Expression  {
    System.out.println("Expression  :   Mutable ASSIGN_KW Expression ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
    emit(Eval.assignOp,$3.place,"",$1.place);
  };
  | Mutable MATH_OP_ASSIGN_KW Expression {
    System.out.println("Expression  :   Mutable MATH_OP_ASSIGN_KW Expression ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
    emit(mathOpAssignVal,$3.place,"",$1.place);
  };
  | Mutable UNARY_MATH_OP_KW{
    System.out.println("Expression  :   Mutable UNANRY_MATH_OP_KW Expression ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
    emit(unaryMathOpVal,"","",((Eval)$$).place);
  };
  | SimpleExpression  {
    System.out.println("Expression  :   SimpleExpression ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };


  SimpleExpression  :   RelExpression   OR_KW  M  SimpleExpression %prec "simpleOr" {
     System.out.println("SimpleExpression  :   SimpleExpression   OR_KW    SimpleExpression");
     if($1.type.equals(Eval.BOOL) && $4.type.equals(Eval.BOOL)){
       $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = $4.type;
        String firtVal = convertToTrueFalseIfPossible($1.place);
        String secondVal = convertToTrueFalseIfPossible($3.place);
        emit(Eval.orOp,firtVal+"",secondVal+"",((Eval)$$).place);
     }
     else if($1.type.equals(Eval.INT) || $4.type.equals(Eval.INT))
     {
        $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = Eval.INT;
        emit(Eval.orOp,$1.place,$4.place,((Eval)$$).place);
     }else{
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };
  | RelExpression  AND_KW M SimpleExpression %prec "simpleAnd"{
     System.out.println("SimpleExpression :  SimpleExpression  AND_KW SimpleExpression");
     if($1.type.equals(Eval.BOOL) && $4.type.equals(Eval.BOOL)){
        $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = $1.type;
        String firtVal = $1.place;
        String secondVal = $4.place;
        firtVal = convertToTrueFalseIfPossible(firtVal);
        secondVal = convertToTrueFalseIfPossible(secondVal);
        emit(Eval.andOp,firtVal+"",secondVal+"",((Eval)$$).place);
     }
     else if($1.type.equals(Eval.INT) || $4.type.equals(Eval.INT))
     {
        $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = Eval.INT;
        emit(Eval.andOp,$1.place,$4.place,((Eval)$$).place);
     }
     else
     {
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };

  | RelExpression  OrElseRel  %prec "orElse" {
     System.out.println("SimpleExpression  :  SimpleExpression   SimpleExpression  OrElseRel");
     if($1.type.equals(Eval.BOOL) && $2.type.equals(Eval.BOOL)){
       $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = $1.type;
        String firtVal = convertToTrueFalseIfPossible($1.place);
        String secondVal = convertToTrueFalseIfPossible($2.place);
        emit(Eval.assignOp,firtVal,"",((Eval)$$).place);
        emit(Eval.ifOp,firtVal,"",(nextQuad()+2)+"");
        emit(Eval.orOp,firtVal+"",secondVal+"",((Eval)$$).place);
     }
     else if($1.type.equals(Eval.INT) || $2.type.equals(Eval.INT))
     {
        $$ = new Eval();
        ((Eval)$$).place = newTemp($1.type,false,0);
        ((Eval)$$).type = Eval.INT;
        emit(Eval.assignOp,$1.place,"",((Eval)$$).place);
        emit(Eval.ifOp,$1.place,"",(nextQuad()+2)+"");
        emit(Eval.orOp,$1.place,$2.place,((Eval)$$).place);
     }else{
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };
  | RelExpression  AndThenRel %prec "andThen" {
    System.out.println("SimpleExpression  :  SimpleExpression  SimpleExpression  AndThenRel");
    if($1.type.equals(Eval.BOOL) && $2.type.equals(Eval.BOOL)){
       $$ = new Eval();
       ((Eval)$$).place = newTemp($1.type,false,0);
       ((Eval)$$).type = $1.type;
       String firtVal = $1.place;
       String secondVal = $2.place;
       firtVal = convertToTrueFalseIfPossible(firtVal);
       secondVal = convertToTrueFalseIfPossible(secondVal);
       emit(Eval.assignOp,firtVal,"",((Eval)$$).place);
       emit(Eval.ifOp,"!"+firtVal,"",(nextQuad()+2)+"");
       emit(Eval.andOp,firtVal+"",secondVal+"",((Eval)$$).place);
    }
    else if($1.type.equals(Eval.INT) || $2.type.equals(Eval.INT))
    {
       $$ = new Eval();
       ((Eval)$$).place = newTemp($1.type,false,0);
       ((Eval)$$).type = Eval.INT;
       emit(Eval.assignOp,$1.place,"",((Eval)$$).place);
       emit(Eval.ifOp,"!"+$1.place,"",(nextQuad()+2)+"");
       emit(Eval.andOp,$1.place,$2.place,((Eval)$$).place);
    }
    else
    {
      System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
    }
  };
  |  NOT_KW   SimpleExpression {
    System.out.println("SimpleExpression  :   NOT_KW   SimpleExpression");
    if($2.type.equals(Eval.BOOL)){
         $$ = new Eval();
        ((Eval)$$).place = newTemp($2.type,false,0);
        ((Eval)$$).type = $2.type;
        emit(Eval.notOp,$2.place,"",((Eval)$$).place);
     }
  };
  | RelExpression {
    System.out.println("SimpleExpression  :  RelExpression");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };

  OrElseRel : OR_KW  ELSE_KW   SimpleExpression {
    System.out.println("OrElseRel : OR_KW  ELSE_KW   RelExpression");
    $$ = new Eval();
    ((Eval)$$).type = $3.type;
    ((Eval)$$).place = $3.place;
    ((Eval)$$).isArray = false;
  };

  AndThenRel  : AND_KW  THEN_KW    SimpleExpression {
    System.out.println("AndThenRel  : AND_KW  THEN_KW    RelExpression; ");
    $$ = new Eval();
    ((Eval)$$).type = $3.type;
    ((Eval)$$).place = $3.place;
    ((Eval)$$).isArray = false;
  };

  RelExpression  :   MathLogicExpression   REL_OP_KW    MathLogicExpression {
    System.out.println("RelExpression  :   MathLogicExpression   REL_OP_KW    MathLogicExpression");
    $$ = new Eval();
    String value = newTemp(Eval.BOOL,false,-1);
    emit(relOpVal,$1.place,$3.place,value);
    ((Eval)$$).type = Eval.BOOL;
    ((Eval)$$).place = value;
    ((Eval)$$).isArray = false;
  };
  | MathLogicExpression {
    System.out.println("RelExpression  :   MathLogicExpression");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
};

  ASSIGNED_MATH_OP : MATH_OP_KW {
    System.out.println("ASSIGNED_MATH_OP : MATH_OP_KW");
    $$ = new Eval();
    ((Eval)$$).type = Eval.unknownType;
    ((Eval)$$).place = mathOpVal;
    ((Eval)$$).isArray = false;
  };

  MathLogicExpression  :   MathLogicExpression   ASSIGNED_MATH_OP    UnaryExpression {
    System.out.println("MathLogicExpression  :   MathLogicExpression   MATH_OP_KW    MathLogicExpression");
    if(($1.type.equals(Eval.INT) && $3.type.equals(Eval.INT))||($1.type.equals(Eval.REAL) && $3.type.equals(Eval.REAL))){
        $$ = new Eval();
        ((Eval)$$).place = newTemp($3.type,false,0);
        ((Eval)$$).type = $3.type;
        emit($2.place,$1.place,$3.place,((Eval)$$).place);
    }
    else if($1.type==Eval.INT && $3.type==Eval.REAL){
      $$ = new Eval();
      ((Eval)$$).place = newTemp($3.type,false,0);
      ((Eval)$$).type = $3.type;
      String var = newTemp($1.type,false,0);
      emit(Eval.castOP,$1.place,Eval.REAL,var);
      emit($2.place,$1.place,$3.place,((Eval)$$).place);
    }
    else if($1.type.equals(Eval.REAL) && $3.type.equals(Eval.INT)){
      $$ = new Eval();
      ((Eval)$$).place = newTemp($3.type,false,0);
      ((Eval)$$).type = $3.type;
      String var = newTemp($3.type,false,0);
      emit(Eval.castOP,$3.place,Eval.REAL,var);
      emit($2.place,$1.place,$3.place,((Eval)$$).place);
    }else if(($1.type.equals(Eval.BOOL) && (!$3.type.equals(Eval.unknownType)))
    || ($3.type.equals(Eval.BOOL) && (!$1.type.equals(Eval.unknownType)))){
      $$ = new Eval();
      ((Eval)$$).place = newTemp(Eval.INT,false,0);
      ((Eval)$$).type = Eval.INT;
      emit($2.place,$1.place,$3.place,((Eval)$$).place);
    }else {
      System.out.println(ANSI_RED+"Error:Unknow type detected: "+$1.type+":"+$2.place+":"+$3.type+ANSI_RESET);
    }
  };
  | UnaryExpression {
    System.out.println("MathLogicExpression  :   UnaryExpression");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };

  UnaryExpression  :    UNARY_OP_KW    UnaryExpression {
    System.out.println("UnaryExpression  :    UNARY_OP_KW    UnaryExpression");
    $$ = new Eval();
    ((Eval)$$).type = $2.type;
    ((Eval)$$).place = newTemp($2.type,$2.isArray,$2.size);
    ((Eval)$$).isArray = $2.isArray;
    emit(unaryOpVal,$2.place,"",((Eval)$$).place);
  };
  | Factor {
    System.out.println("UnaryExpression  :   Factor");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };

  Factor  :   Mutable {
    System.out.println("Factor  :   Mutable");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
};
  | Immutable  {
    System.out.println("Factor  :   Immutable");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };

  Mutable  :   ID {
    System.out.println("Mutable  :   ID ");
    $$ = new Eval();
    SymbolTable.Record symbol=symbolTable.getSymbol($1.place);
    if(symbol!=null){
      ((Eval)$$).type = symbol.type;
      ((Eval)$$).place = symbol.name;
      ((Eval)$$).isArray = symbol.isArray;
    }else {
      System.out.println(ANSI_RED+"Error:symbol not declared"+ANSI_RESET);
    }
  };
  | Mutable LEFTAR Expression RIGHTAR {
    System.out.println("Mutable [ Expression ]");
    $$ = new Eval();
    SymbolTable.Record symbol=symbolTable.getSymbol($1.place);
    if(symbol!=null ){
      String place2 = "";
      // SymbolTable.Record ArrIndex=symbolTable.getSymbol($3.place);
      // if(ArrIndex!=null){
      //   place2 = ArrIndex.name;
      // }else {
      //   place2 = $3.place;
      // }
      place2 = $3.place;
      // if(symbol.size<=$3.place){
      //   System.out.println(ANSI_RED+"Array out of index exception may happen:"+"Array:"+$1.place+" Index is:"+$3.place+ANSI_RESET);
      // }
      ((Eval)$$).type = symbol.type;
      ((Eval)$$).place = symbol.name+"["+place2+"]";
      ((Eval)$$).isArray = symbol.isArray;
    }else {
      System.out.println(ANSI_RED+"Error:symbol not declared"+ANSI_RESET);
    }

  };
  | Mutable DOT_KW ID {System.out.println("Mutable . ID ");};

  Immutable  :  LEFTPA Expression rightPaQ {
    System.out.println("Immutable  :  ( Expression ) ");
    $$ = new Eval();
    ((Eval)$$).type = $2.type;
    ((Eval)$$).place = $2.place;
    ((Eval)$$).isArray = $2.isArray;
  };
  | Call {
    System.out.println("Immutable  :  Call ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };
  | Constant {
    System.out.println("Immutable  :  Constant ");
    $$ = new Eval();
    ((Eval)$$).type = $1.type;
    ((Eval)$$).place = $1.place;
    ((Eval)$$).isArray = $1.isArray;
  };

  Call  :   ID LEFTPA Args rightPaQ  {
    System.out.println("Call  :   ID ( Args ) ");
    $$ = new Eval();
    for(int i=0;i<$3.argsList.size();i++){
      emit(Eval.stackPush,"","",$3.argsList.get(i).place);
    }
    emit(Eval.stackPush,"","",(nextQuad()+2)+"");
    callTable.addNewCall(nextQuad()+1,"Line"+(nextQuad()+1));
    ScopeRecord scopeRecord=scopeTable.getByName($1.place);
    if(scopeRecord==null){
      System.out.println(ANSI_RED+"Error:Function not found"+ANSI_RESET);
      ((Eval)$$).place = scopeRecord.returnValue;
      ((Eval)$$).type = Eval.unknownType;
    }else{
      emit(Eval.gotoOp,"","",scopeRecord.startLine);
      ((Eval)$$).place = scopeRecord.returnValue;
      ((Eval)$$).type = scopeRecord.returnType;
    }
  };

  Args  :   ArgList {
    System.out.println("Args  :   ArgList");
    $$ = new Eval();
    ((Eval)$$).argsList = $1.argsList; 
  };
  | {
    System.out.println("  Args  :  lambda");
    $$ = new Eval();
  };

  ArgList  :   ArgList COLUMN Expression {
    System.out.println("ArgList  :   ArgList , Expression");
    $$ = new Eval();
    ((Eval)$$).argsList = $1.argsList;
    ((Eval)$$).argsList.add($3);
  };
  | Expression  {
    System.out.println("ArgList  :  Expression");
    $$ = new Eval();
    ((Eval)$$).argsList.add($1);
  };

  Constant  :   NUMCONST {
    System.out.println("Constant  :   NUMCONST");
    $$ = new Eval();
    ((Eval)$$).type = Eval.INT;
    ((Eval)$$).place = intVal;
    ((Eval)$$).isArray = false;
  };
  | REALCONST {
    System.out.println("Constant  :   REALCONST");
    $$ = new Eval();
    ((Eval)$$).type = Eval.REAL;
    ((Eval)$$).place = realVal;
    ((Eval)$$).isArray = false;
  };
  | CHARCONST {
    System.out.println("Constant  :   CHARCONST");
    $$ = new Eval();
    ((Eval)$$).type = Eval.CHAR;
    ((Eval)$$).place = realVal;
    ((Eval)$$).isArray = false;
  };
  |  BOOL_KW {
    System.out.println("Constant  :   BOOL_KW");
    $$ = new Eval();
    ((Eval)$$).type = Eval.BOOL;
    if(boolVal.equals("true")){
      ((Eval)$$).place = "1";
    }else{
      ((Eval)$$).place = "0";
    }
    ((Eval)$$).isArray = false;
  };

  ID : ID_KW {
      $$ = new Eval();
      ((Eval)$$).place = idVal;
      ((Eval)$$).type = Eval.unknownType;
  }

  rightPaQ : RIGHTPA
  {
    $$ = new Eval();
    ((Eval)$$).quad = nextQuad();
  }
  M:
  {
    $$ = new Eval();
    ((Eval)$$).quad = nextQuad();
  }
  N:
  {
    $$ = new Eval();
    ((Eval)$$).symbolTableQuad = symbolTable.getSize();
    ((Eval)$$).quad = nextQuad();
  }
%%
//Java code part must be placed here
//EvalClass
class Eval
{
  public static final String INT ="int";
  public static final String BOOL = "bool";
  public static final String REAL = "real";
  public static final String CHAR = "char";
  public static final String STRING = "string";
  public static final String Func = "function";
  public static final String rectype = "rectype";
  public static final String unknownType = "unknown";

  public static final String castOP = "cast";
  public static final String constOp = "const";
  public static final String assignOp = "=";
  public static final String andOp = "and";
  public static final String orOp = "or";
  public static final String notOp = "not";
  public static final String initOp = "init";
  public static final String ifOp = "if";
  public static final String stackPop = "stackPop";
  public static final String stackPush = "stackPush";
  public static final String gotoOp = "gotoOp";
  public static final String variableGotoOp = "varGotoOp";

  public static final String[] relopOpList = new String[]{".le",".lt",".gt",".ge",".eq",".ne"};
  public static final String[] mathOpList = new String[]{"+","-","*","/","%"};
  public static final String[] unaryMathOPList = new String[]{"++","--"};
  public static final String[] mathOpAssignList = new String[]{"+=","-=","*=","/="};
  public static final String[] uniryOpList = new String[]{"-","*","?"};

  public String place;
  public String type;
  public boolean isArray;
  public int size;
  public int quad;
  public int symbolTableQuad;
  public int endOfFuncWaitingGoto;
  public String place2;
  public String returnName;
  public int endOfBreakGoto=-1;

  public Eval defaultInit;

  public List<Eval> typeInitList;
  public ArrayList<Integer> trueList;
  public ArrayList<Integer> falseList;
  public ArrayList<Integer> breakList;
  public ArrayList<Integer> nextList;
  public List<Integer> returnList;
  public List<Eval> argsList;
  public ArrayList<Quad> structList;

  public int quadIndex;
  public ArrayList<Integer> caseStartPoint;
  public ArrayList<Eval> declaredCases;

  public Eval()
  {
    typeInitList = new ArrayList<>();
    falseList = new ArrayList<>();
    nextList = new ArrayList<>();
    returnList = new ArrayList<>();
    argsList = new ArrayList<>();
    breakList= new ArrayList<>();
    structList= new ArrayList<>();
  }
  public static ArrayList<Integer> makeList(int i) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(i);
    return list;
  }
  public static ArrayList<Integer> merge(List i , List j){
      ArrayList<Integer> list = new ArrayList<>();
      if(i!=null && i.size()>0){
          list.addAll(i);
      }
      if(j!=null && j.size()>0){
          list.addAll(j);
      }
      return list;
  }
}
class ScopeRecord {
  public int symbolTableIndex;
  public int scopeStart;
  public int scopeEnd;
  public int emitStart;
  public int emitEnd;
  public boolean isFunction;
  public List<Integer>params;
  public String returnValue;
  public String returnType;
  public String startLine;
  public ScopeRecord(int symbolTableIndex,int scopeStart,int scopeEnd,int emitStart,int emitEnd,boolean isFunction,List<Integer>params,String returnValue,String returnType,String startLine)
  {
    this.symbolTableIndex = symbolTableIndex;
    this.scopeStart = scopeStart;
    this.scopeEnd = scopeEnd;
    this.emitStart = emitStart;
    this.emitEnd = emitEnd;
    this.isFunction = isFunction;
    this.params = params;
    this.returnValue = returnValue;
    this.returnType = returnType;
    this.startLine = startLine;
  }
}
//ScopeTableClass
class ScopeTable {
  private List<ScopeRecord> table;
  private SymbolTable symbolTable;
  public ScopeTable(SymbolTable symbolTable)
  {
    table = new ArrayList<>();
    this.symbolTable = symbolTable;
  }
  //It's symbolTable index not it's index
  public ScopeRecord getByIndex(int index){
    for(int i=0;i<table.size();i++){
      if(table.get(i).symbolTableIndex==index){
        return table.get(i);
      }
    }
    return null;
  }

  public ScopeRecord getByName(String name)
  {
    int index = symbolTable.lookUp(name);
    if(index==-1){
      return null;
    }
    return getByIndex(index);
  }

  public List<ScopeRecord> getAll(){
    return table;
  }

  public void addNewScope(int symbolTableIndex,int scopeStart,int scopeEnd,int emitStart,int emitEnd)
  {
    table.add(new ScopeRecord(symbolTableIndex,scopeStart,scopeEnd,emitStart,emitEnd,false,null,"",Eval.unknownType,""));
  }
  public void addNewScope(int symbolTableIndex,int scopeStart,int scopeEnd,int emitStart,int emitEnd,List<Integer>params,String funcName,String returnType,String startLine)
  {
    table.add(new ScopeRecord(symbolTableIndex,scopeStart,scopeEnd,emitStart,emitEnd,true,params,funcName,returnType,startLine));
  }
}

class CallTable{
  private List<Record> callRecords;
  protected class Record{
    public int name;
    public String value;
    public Record(int name,String value){
      this.name = name;
      this.value = value;
    }
  }
  public CallTable()
  {
    callRecords = new ArrayList<>();
  }
  public void addNewCall(int name,String value)
  {
    callRecords.add(new Record(name,value));
  }
  public List<Record> getAll()
  {
    return callRecords;
  }
}
//QuadClass
class Quad
{
  public String operation;
  public String arg0;
  public String arg1;
  public String result;
  public Quad(String operation,String arg0,String arg1,String result)
  {
    this.operation = operation;
    this.arg0 = arg0;
    this.arg1 = arg1;
    this.result = result;
  }
}
//SymbolTableClass
class SymbolTable
{
  public static final int NOT_FOUND = -1;
  public static final int ERROR = -2;
  protected class Record
  {
      public String name;
      public String type;
      public boolean isArray;
      public int size;
      public String scope="";
      public Record(String name,String type,boolean isArray,int size)
      {
          this.name = name;
          this.type = type;
          this.isArray = isArray;
          this.size = size;
      }
  }

  private List<Record> table;

  public SymbolTable()
  {
      table = new ArrayList<>();
  }

  public Record getSymbol(String name)
  {
    int index = lookUp(name);
    if(lookUp(name)!=NOT_FOUND){
      return table.get(index);
    }else {
      return null;
    }
  }

  public Record getByIndex(int index){
    return table.get(index);
  }

  public int lookUp(String name)
  {
    for(int i=0;i<table.size();i++){
      if(table.get(i).name.equals(name)){
        return i;
      }
    }
    return NOT_FOUND;
  }

  public int getSize()
  {
    return table.size();
  }

  public int addToSymbolTable(String name,String type,boolean isArray,int size)
  {
    boolean found = false;
    for(int i=0;i<table.size();i++){
      if(table.get(i).name.equals(name) && table.get(i).scope.equals("")){
        found = true;
        break;
      }
    }
    if(!found)
    {
      Record p = new Record(name,type,isArray,size);
      table.add(p);
      return table.size()-1;
    }
    return ERROR;
  }
}

class StructTable{
  private List<Record> structRecords;
  protected class Record{
      public int symbolTableIndex;
      public List<Quad>params;
      public Record(int symbolTableIndex, List<Quad>params){
            this.symbolTableIndex = symbolTableIndex;
          this.params = params;
      }
    }
    public StructTable(){
      structRecords = new ArrayList<>();
    }
    // private void emit(String operation,String arg0,String arg1,String result)
    public void addnewStruct(int symbolTableIndex,List<Quad>params){
      structRecords.add(new Record(symbolTableIndex,params));
    }

    public List<Record> getAll()
    {
      return structRecords;
    }

}