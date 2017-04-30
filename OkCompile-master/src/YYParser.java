/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 3 of "YYParser.y"  */

    import java.util.List;
    import java.io.*;
    import java.util.ArrayList;
  

/**
 * A Bison parser, automatically generated from <tt>YYParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int LETTER = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int DIGIT = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int NON_ZERO_DIGIT = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int HASH_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOL_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int WHITE_SPACE = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int LETDIG = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ID_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int NUMCONST = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int WITHOUT_N = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int CHARCONST = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENT = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int REALCONST = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int CASE_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int REL_OP_KW = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int MATH_OP_KW = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int UNARY_MATH_OP_KW = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int MATH_OP_ASSIGN_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int UNARY_OP_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int RECORD_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int STATIC_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int TYPESPECIFIER_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int PUNC_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMI_COLUMN_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFTAC = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHTAC = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFTAR = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHTAR = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int COLUMN = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int TWO_COLUMN = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int LEFTPA = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int RIGHTPA = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int DOT_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT = 304;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 431 of "YYParser.y"  */
    {
    System.out.println("Program  :  {DeclarationList}");
    generateCode();
  };
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 435 of "YYParser.y"  */
    {
    System.out.println("DeclarationList : DeclarationList Declaration");
  };
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 438 of "YYParser.y"  */
    {
      System.out.println("DeclarationList :  Declaration");
  };
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 441 of "YYParser.y"  */
    {
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
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 458 of "YYParser.y"  */
    {
      System.out.println("Declaration : FunDeclaration");

    };
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 462 of "YYParser.y"  */
    {System.out.println("Declaration : RecDeclaration");};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 464 of "YYParser.y"  */
    {
    System.out.println("ScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = ((Eval)(yystack.valueAt (3-(2)))).typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = ((Eval)(yystack.valueAt (3-(1)))).type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
              symbolTable.getByIndex(index).scope="GLOBAL";
              if( typeInitList.get(i).defaultInit!= null ){
                if(typeInitList.get(i).defaultInit.type.equals(((Eval)(yystack.valueAt (3-(1)))).type)){
                  //emit(Eval.assignOp,typeInitList.get(i).defaultInit.place,"",typeInitList.get(i).place);
                  emit(Eval.initOp,((Eval)(yystack.valueAt (3-(1)))).type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place);
                }else {
                  System.out.println("Error:MisMatch Type initilizer");
                  break;
                }
              }else{
                emit(Eval.initOp,((Eval)(yystack.valueAt (3-(1)))).type,"",typeInitList.get(i).place);
              }
              System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }

  };
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 500 of "YYParser.y"  */
    {
    System.out.println("RecDeclaration : record ID { LocalDeclarations }");
    yyval = new Eval();
    symbolTable.addToSymbolTable(((Eval)(yystack.valueAt (5-(2)))).place,Eval.rectype,((Eval)(yystack.valueAt (5-(2)))).isArray,((Eval)(yystack.valueAt (5-(2)))).size);
    structTable.addnewStruct(symbolTable.getSize()-1,((Eval)(yystack.valueAt (5-(4)))).structList);
  };
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 506 of "YYParser.y"  */
    {
    System.out.println("RecDeclaration : record ID { lambda }");
    symbolTable.addToSymbolTable(((Eval)(yystack.valueAt (4-(2)))).place,Eval.rectype,((Eval)(yystack.valueAt (4-(2)))).isArray,((Eval)(yystack.valueAt (4-(2)))).size);
    structTable.addnewStruct(symbolTable.getSize()-1,((Eval)yyval).structList);
  };
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 512 of "YYParser.y"  */
    {
    System.out.println("RecLocalDeclarations :  RecLocalDeclarations  RecScopedVarDelaration");
    yyval = new Eval();
    ((Eval)yyval).structList= ((Eval)(yystack.valueAt (2-(1)))).structList; 
  ((Eval)yyval).structList.addAll(((Eval)(yystack.valueAt (2-(2)))).structList);

  };
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 519 of "YYParser.y"  */
    {
    System.out.println("RecLocalDeclarations : RecScopedVarDelaration");
  yyval = new Eval();
    ((Eval)yyval).structList= ((Eval)(yystack.valueAt (1-(1)))).structList;   
  };
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 525 of "YYParser.y"  */
    {
    System.out.println("RecScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = ((Eval)(yystack.valueAt (3-(2)))).typeInitList;
    yyval = new Eval();
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = ((Eval)(yystack.valueAt (3-(1)))).type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                if(((Eval)(yystack.valueAt (3-(1)))).place.equals("const")){
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals(((Eval)(yystack.valueAt (3-(1)))).type)){
                      ((Eval)yyval).structList.add(new Quad(Eval.constOp,((Eval)(yystack.valueAt (3-(1)))).type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place));
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
                    if(typeInitList.get(i).defaultInit.type.equals(((Eval)(yystack.valueAt (3-(1)))).type)){
                      // emit(Eval.assignOp,typeInitList.get(i).defaultInit.place,"",typeInitList.get(i).place);
                    ((Eval)yyval).structList.add(new Quad(Eval.initOp,((Eval)(yystack.valueAt (3-(1)))).type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place)); 
                    }else {
                      System.out.println("Error:MisMatch Type initilizer");
                      break;
                    }
                  }else
                  {
                    ((Eval)yyval).structList.add(new Quad(Eval.initOp,((Eval)(yystack.valueAt (3-(1)))).type,"",typeInitList.get(i).place));  
                  }
                }
                System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }

  };
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 575 of "YYParser.y"  */
    {
    System.out.println("ScopedVarDelaration :  ScopedTypeSpecifer  VarDeclList ;");
    List<Eval> typeInitList = ((Eval)(yystack.valueAt (3-(2)))).typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = ((Eval)(yystack.valueAt (3-(1)))).type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                if(((Eval)(yystack.valueAt (3-(1)))).place.equals("const")){
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals(((Eval)(yystack.valueAt (3-(1)))).type)){
                      emit(Eval.constOp,((Eval)(yystack.valueAt (3-(1)))).type,typeInitList.get(i).defaultInit.place,typeInitList.get(i).place);
                    }else {
                      System.out.println(ANSI_RED+"Error:MisMatch Type initilizer"+ANSI_RESET);
                      break;
                    }
                  }else {//TODO We need to check if variable is static or not
                    System.out.println(ANSI_RED+"Error:Static varibales must have intial value"+ANSI_RESET);
                  }
                }else {
                  emit(Eval.initOp,((Eval)(yystack.valueAt (3-(1)))).type,"",typeInitList.get(i).place);
                  if( typeInitList.get(i).defaultInit!= null ){
                    if(typeInitList.get(i).defaultInit.type.equals(((Eval)(yystack.valueAt (3-(1)))).type)){
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
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 619 of "YYParser.y"  */
    {
      System.out.println("VarDeclList :  VarDeclList , VarDeclInitialize");
      yyval = new Eval();
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
      //((Eval)$$).isArray = false;
      ((Eval)yyval).typeInitList = ((Eval)(yystack.valueAt (3-(1)))).typeInitList;
      ((Eval)yyval).typeInitList.add(((Eval)(yystack.valueAt (3-(3)))));
    };
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 627 of "YYParser.y"  */
    {
      System.out.println("VarDeclList : VarDeclInitialize");
      yyval = new Eval();
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
      //((Eval)$$).isArray = false;
      ((Eval)yyval).typeInitList.add(((Eval)(yystack.valueAt (1-(1)))));
};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 635 of "YYParser.y"  */
    {
      System.out.println("VarDeclInitialize :  VarDeclId");
      yyval = new Eval();
      ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
      ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
      ((Eval)yyval).size = ((Eval)(yystack.valueAt (1-(1)))).size;
    };
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 643 of "YYParser.y"  */
    {
      System.out.println("VarDeclInitialize :  VarDeclId : SimpleExpression");
      yyval = new Eval();
      ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(1)))).place;
      ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (3-(1)))).isArray;
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(1)))).type;
      ((Eval)yyval).size = ((Eval)(yystack.valueAt (3-(1)))).size;
      ((Eval)yyval).defaultInit=((Eval)(yystack.valueAt (3-(3))));
    };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 654 of "YYParser.y"  */
    {
        System.out.println("VarDeclId :  ID");
        yyval = new Eval();
        ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
        ((Eval)yyval).isArray = false;
        ((Eval)yyval).type = Eval.unknownType;
      };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 661 of "YYParser.y"  */
    {
        System.out.println("VarDeclId :  ID [ NUMCONST ]");
        yyval = new Eval();
        ((Eval)yyval).place = ((Eval)(yystack.valueAt (4-(1)))).place;
        ((Eval)yyval).isArray = true;
        ((Eval)yyval).type = Eval.unknownType;
        ((Eval)yyval).size = Integer.parseInt(intVal.replaceAll(" ",""));
      };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 670 of "YYParser.y"  */
    {//TODO We need to do something about
    System.out.println("ScopedTypeSpecifer : static TypeSpecifier");
    yyval = new Eval();//TODO
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (2-(2)))).isArray;
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(2)))).type;
    ((Eval)yyval).place = "const";
  };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 677 of "YYParser.y"  */
    {
    System.out.println("ScopedTypeSpecifer : TypeSpecifier");
    yyval = new Eval();
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
  };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 685 of "YYParser.y"  */
    {
    System.out.println("TypeSpecifier :  ReturnTypeSpecifer");
    yyval = new Eval();
    ((Eval)yyval).isArray = false;
    //$$.type = typeVal;
    if(typeVal.equals("int")){
        ((Eval)yyval).type = Eval.INT;
    }else if(typeVal.equals("real")){
        ((Eval)yyval).type = Eval.REAL;
    }else if(typeVal.equals("bool")){
        ((Eval)yyval).type = Eval.BOOL;
    }else if(typeVal.equals("char")){
        ((Eval)yyval).type = Eval.CHAR;
    }
    ((Eval)yyval).place = "";
  };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 701 of "YYParser.y"  */
    {
    System.out.println("TypeSpecifier :  Rectype");
    yyval = new Eval();
    ((Eval)yyval).isArray = false;
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).place ="";//$1.place;
  };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 709 of "YYParser.y"  */
    {
    System.out.println("Rectype : ID");
    yyval = new Eval();
    ((Eval)yyval).isArray = false;
    ((Eval)yyval).type =  Eval.rectype;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
  };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 719 of "YYParser.y"  */
    {
    yyval = new Eval();
    symbolTable.addToSymbolTable(((Eval)(yystack.valueAt (3-(1)))).place,Eval.Func,false,0);
    scopeTable.addNewScope(symbolTable.getSize()-1,((Eval)(yystack.valueAt (3-(1)))).symbolTableQuad,((Eval)(yystack.valueAt (3-(3)))).symbolTableQuad,((Eval)(yystack.valueAt (3-(1)))).quad,nextQuad(),((Eval)(yystack.valueAt (3-(1)))).nextList,((Eval)(yystack.valueAt (3-(1)))).returnName,((Eval)(yystack.valueAt (3-(1)))).type,(((Eval)(yystack.valueAt (3-(1)))).endOfFuncWaitingGoto+1)+"");
//    private void backpatch(ArrayList<Integer> list, int quadNumber) {
    if(((Eval)(yystack.valueAt (3-(1)))).endOfFuncWaitingGoto>=0){
      backpatch(((Eval)(yystack.valueAt (3-(1)))).endOfFuncWaitingGoto,nextQuad());
    }
    if(!((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.unknownType)){
      setReturn(((Eval)(yystack.valueAt (3-(2)))).returnList,((Eval)(yystack.valueAt (3-(1)))).returnName);
    }
    backpatch(((Eval)(yystack.valueAt (3-(2)))).nextList,((Eval)(yystack.valueAt (3-(1)))).place2);//It is where end of func must go
    //backpatch($2.nextList,"Call0");//It is where end of func must go
    for(int j=((Eval)(yystack.valueAt (3-(1)))).symbolTableQuad;j<((Eval)(yystack.valueAt (3-(3)))).symbolTableQuad;j++){
        if(j<0){
          continue;
        }
        SymbolTable.Record r=symbolTable.getByIndex(j);
        if(r.type!=Eval.Func
          && r.type!=Eval.rectype){
          if(r.scope.equals("")){
            r.scope = ((Eval)(yystack.valueAt (3-(1)))).place;
          }
        }
    } 
  };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 746 of "YYParser.y"  */
    {//TODO We need to check for return Statement
    System.out.println("FunDeclaration :  TypeSpecifier  ID ( Params ) Statement");
    yyval = new Eval();
    if(!((Eval)(yystack.valueAt (5-(2)))).place.equals("#aa11")){
      emit(Eval.gotoOp,"","","");
      ((Eval)yyval).endOfFuncWaitingGoto = nextQuad()-1;
    }else
    {
      ((Eval)yyval).endOfFuncWaitingGoto = -1;
    }
    int emitStart = nextQuad();
    int symbolTableQuad = symbolTable.getSize()-((Eval)(yystack.valueAt (5-(4)))).nextList.size()-1; 
    for(int i=0;i<((Eval)(yystack.valueAt (5-(4)))).nextList.size();i++){
      SymbolTable.Record r=symbolTable.getByIndex(((Eval)(yystack.valueAt (5-(4)))).nextList.get(i));
      emit(Eval.initOp,r.type,"",r.name);
      emit(Eval.stackPop,r.type,"",r.name);
    }
    String funcReturn = newFunc(((Eval)(yystack.valueAt (5-(2)))).place,((Eval)(yystack.valueAt (5-(1)))).type);
    //String temp = newTemp(Eval.STRING,false,0);
    //emit(Eval.assignOp,"","",funcReturn);
    String temp2 = "0";
    if(!((Eval)(yystack.valueAt (5-(2)))).place.equals("#aa11")){
      temp2 = newTemp(Eval.INT,false,0);
      emit(Eval.stackPop,Eval.INT,false+"",temp2);
    }
    ((Eval)yyval).place2 = temp2;//It is where end of func most go
    ((Eval)yyval).symbolTableQuad = symbolTableQuad;//For scope
    ((Eval)yyval).quad = emitStart;//For scope
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (5-(1)))).type;//It is where it must set values as return
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (5-(4)))).nextList;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (5-(2)))).place;
    ((Eval)yyval).returnName = funcReturn;
  };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 779 of "YYParser.y"  */
    {
    System.out.println("FunDeclaration :   ID ( Params ) Statement");
    yyval = new Eval();
    if(!((Eval)(yystack.valueAt (5-(1)))).place.equals("#aa11")){
      emit(Eval.gotoOp,"","","");
      ((Eval)yyval).endOfFuncWaitingGoto = nextQuad()-1;
    }else
    {
      ((Eval)yyval).endOfFuncWaitingGoto = -1;
    }
    for(int i=0;i<((Eval)(yystack.valueAt (5-(3)))).nextList.size();i++){
      SymbolTable.Record r=symbolTable.getByIndex(((Eval)(yystack.valueAt (5-(3)))).nextList.get(i));
      emit(Eval.initOp,r.type,"",r.name);
      emit(Eval.stackPop,r.type,"",r.name);
    }
    // private String newTemp(String type,boolean isArray,int size)
    String temp = "0";
    if(!((Eval)(yystack.valueAt (5-(1)))).place.equals("#aa11")){
      temp = newTemp(Eval.INT,false,0);
      emit(Eval.stackPop,Eval.INT,false+"",temp);
    }
    ((Eval)yyval).place2 = temp;//It is where end of func most go
    ((Eval)yyval).quad = ((Eval)(yystack.valueAt (5-(4)))).quad;
    ((Eval)yyval).symbolTableQuad = ((Eval)(yystack.valueAt (5-(4)))).symbolTableQuad-((Eval)(yystack.valueAt (5-(3)))).nextList.size()-1;
    ((Eval)yyval).type = Eval.unknownType;//It is where it must set values as return
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (5-(3)))).nextList;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (5-(1)))).place;
  };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 808 of "YYParser.y"  */
    {
    System.out.println("Params :  ParamList ");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (1-(1)))).nextList;
  };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 813 of "YYParser.y"  */
    {
    System.out.println("Params : lambda");
    yyval = new Eval();
  };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 818 of "YYParser.y"  */
    {
    System.out.println("ParamList :  ParamList ; ParamTypeList");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (3-(1)))).nextList;
    ((Eval)yyval).nextList.addAll(((Eval)(yystack.valueAt (3-(3)))).nextList);
  };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 824 of "YYParser.y"  */
    {
    System.out.println("ParamList :  ParamTypeList");
    yyval = new Eval();
    ((Eval)yyval).nextList.addAll(((Eval)(yystack.valueAt (1-(1)))).nextList);
  };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 830 of "YYParser.y"  */
    {
    System.out.println("ParamTypeList :  TypeSpecifier  ParamIdList");
    yyval = new Eval();
    List<Eval> typeInitList = ((Eval)(yystack.valueAt (2-(2)))).typeInitList;
    for(int i=0;i<typeInitList.size();i++){
        if(typeInitList.get(i).type.equals(Eval.unknownType))
        {
            typeInitList.get(i).type = ((Eval)(yystack.valueAt (2-(1)))).type;
            int index=symbolTable.addToSymbolTable(typeInitList.get(i).place,typeInitList.get(i).type,typeInitList.get(i).isArray,typeInitList.get(i).size);
            if(index==symbolTable.ERROR)
            {
                System.out.println(ANSI_RED + "Error:Symbol is already added"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray + ANSI_RESET);
                break;
            }else {
                System.out.println(ANSI_BLUE+"Symbol added successfully:"+typeInitList.get(i).place+":"+typeInitList.get(i).type+":"+typeInitList.get(i).isArray+ANSI_RESET);
                ((Eval)yyval).nextList.add(index);
            }
        }else{
          System.out.println("Error:Type is already defined");
        }
    }
  };
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 853 of "YYParser.y"  */
    {
    System.out.println("ParamIdList :  ParamIdList , ParamId");
    yyval = new Eval();
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (3-(1)))).isArray;
    ((Eval)yyval).type = Eval.unknownType;
    ((Eval)yyval).typeInitList = ((Eval)(yystack.valueAt (3-(1)))).typeInitList;
    ((Eval)yyval).typeInitList.add(((Eval)(yystack.valueAt (3-(3)))));
  };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 862 of "YYParser.y"  */
    {
    System.out.println("ParamIdList :  ParamId");
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
    ((Eval)yyval).type = Eval.unknownType;
    ((Eval)yyval).typeInitList.add(((Eval)(yystack.valueAt (1-(1)))));
  };
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 870 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = false;
    ((Eval)yyval).type = Eval.unknownType;
    System.out.println("ParamId :  ID");
  };
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 877 of "YYParser.y"  */
    {
    System.out.println("ParamId :  ID []");
    yyval = new Eval();
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(1)))).place;
    ((Eval)yyval).isArray = true;
    ((Eval)yyval).type = Eval.unknownType;
    ((Eval)yyval).size = -1;
    ((Eval)yyval).typeInitList = new ArrayList<>();
  };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 887 of "YYParser.y"  */
    {
    System.out.println("Statement :  ExpressionStmt");
    yyval = new Eval();
  };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 891 of "YYParser.y"  */
    {
    System.out.println("Statement :  CompoundStmt");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (1-(1)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (1-(1)))).returnList;
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (1-(1)))).breakList;
  };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 898 of "YYParser.y"  */
    {
    System.out.println("Statement :  SelectionStmt");
    yyval = new Eval();
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (1-(1)))).breakList;

    //((Eval)$$).nextList = $1.nextList;
  };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 905 of "YYParser.y"  */
    {
    System.out.println("Statement :  ItereationStmt");
    yyval = new Eval();
    
  };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 910 of "YYParser.y"  */
    {
    System.out.println("Statement :  ReturnStmt");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (1-(1)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (1-(1)))).returnList;
  };
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 916 of "YYParser.y"  */
    {
    System.out.println("Statement : BreakStmt");
    yyval = new Eval();
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (1-(1)))).breakList;
  };
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 922 of "YYParser.y"  */
    {
    System.out.println("{ LEFTAC  RIGHTAC }");
    yyval = new Eval();
  };
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 926 of "YYParser.y"  */
    {
    System.out.println("{ LocalDeclarations  StatementList }");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (3-(2)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (3-(2)))).returnList;
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (3-(2)))).breakList;
  };
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 935 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (2-(2)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (2-(2)))).returnList;
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (2-(2)))).breakList;
  };
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 942 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (1-(1)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (1-(1)))).returnList;
    ((Eval)yyval).breakList = ((Eval)(yystack.valueAt (1-(1)))).breakList;
  };
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 949 of "YYParser.y"  */
    {
    yyval = new Eval();
  };
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 953 of "YYParser.y"  */
    {System.out.println("LocalDeclarations :  LocalDeclarations  ScopedVarDelaration");};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 954 of "YYParser.y"  */
    {System.out.println("LocalDeclarations : ScopedVarDelaration");};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 956 of "YYParser.y"  */
    {
    System.out.println("StatementList :  StatementList  Statement");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (2-(1)))).nextList;
    ((Eval)yyval).nextList=Eval.merge(((Eval)yyval).nextList,((Eval)(yystack.valueAt (2-(2)))).nextList);
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (2-(1)))).returnList;
    ((Eval)yyval).returnList=Eval.merge(((Eval)yyval).returnList,((Eval)(yystack.valueAt (2-(2)))).returnList);
	((Eval)yyval).breakList=((Eval)(yystack.valueAt (2-(1)))).breakList;
	((Eval)yyval).breakList=Eval.merge(((Eval)yyval).breakList,((Eval)(yystack.valueAt (2-(2)))).breakList);
  };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 966 of "YYParser.y"  */
    {
    System.out.println("StatementList : Statement");
    yyval = new Eval();
    ((Eval)yyval).nextList = ((Eval)(yystack.valueAt (1-(1)))).nextList;
    ((Eval)yyval).returnList = ((Eval)(yystack.valueAt (1-(1)))).returnList;
    ((Eval)yyval).breakList=((Eval)(yystack.valueAt (1-(1)))).breakList;
  };
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 974 of "YYParser.y"  */
    {System.out.println("ExpressionStmt :  Expression ;");};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 975 of "YYParser.y"  */
    {System.out.println(";");};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 977 of "YYParser.y"  */
    {
    System.out.println(" SelectionStmt :   IF_KW  ( SimpleExpression ) Statement ");
    backpatch(((Eval)(yystack.valueAt (5-(3)))).trueList,((Eval)(yystack.valueAt (5-(4)))).quad);
    backpatch(((Eval)(yystack.valueAt (5-(3)))).falseList,nextQuad());
    yyval = new Eval();
    ((Eval)yyval).breakList=((Eval)(yystack.valueAt (5-(5)))).breakList;
    // ((Eval)$$).nextList = new ArrayList<>();
    // ((Eval)$$).nextList.add(nextQuad()-1);
    // ((Eval)$$).nextList = Eval.merge(((Eval)$$).nextList,null);
  };
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 987 of "YYParser.y"  */
    {
    System.out.println("SelectionStmt :  IF_KW  ( SimpleExpression ) Statement   ELSE_KW   Statement");
    backpatch(((Eval)(yystack.valueAt (8-(3)))).trueList,((Eval)(yystack.valueAt (8-(4)))).quad);
    backpatch(((Eval)(yystack.valueAt (8-(3)))).falseList,((Eval)(yystack.valueAt (8-(7)))).quad);
    yyval = new Eval();
    ((Eval)yyval).breakList=((Eval)(yystack.valueAt (8-(5)))).breakList;
  };
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 994 of "YYParser.y"  */
    {
    System.out.println("SelectionStmt :  SWITCH_KW   ( SimpleExpression ) CaseElement  DefaultElement   END_KW  ");
       yyval = new Eval();
    int lastCase =((Eval)(yystack.valueAt (9-(5)))).declaredCases.size() - 1;
    ((Eval)yyval).place = newTemp(Eval.unknownType,false,0);
    backpatch(((Eval)(yystack.valueAt (9-(3)))).falseList,((Eval)(yystack.valueAt (9-(9)))).quad);
    
    String temp= newTemp(Eval.BOOL,false,0);
    for(int i = 0; i < ((Eval)(yystack.valueAt (9-(5)))).declaredCases.size() - 1; i++) {
      // private String newTemp(String type,boolean isArray,int size)
      emit(".eq",((Eval)(yystack.valueAt (9-(3)))).place,((Eval)(yystack.valueAt (9-(5)))).declaredCases.get(i).place,temp);
      emit(Eval.ifOp, temp, "",((Eval)(yystack.valueAt (9-(5)))).trueList.get(i)+"");
      // backpatch($6.declaredCases.get(i).breakList,($9.quad));
    }
    
    emit(".eq",((Eval)(yystack.valueAt (9-(3)))).place,((Eval)(yystack.valueAt (9-(5)))).declaredCases.get(lastCase).place,((Eval)yyval).place);
    emit(Eval.ifOp, ((Eval)yyval).place, "", ((Eval)(yystack.valueAt (9-(5)))).trueList.get(lastCase)+""); // result will not be backpatched.
    
    ((Eval)yyval).nextList=Eval.merge(((Eval)(yystack.valueAt (9-(5)))).nextList,((Eval)(yystack.valueAt (9-(7)))).nextList);
    emit(Eval.gotoOp,"","",((Eval)(yystack.valueAt (9-(7)))).trueList.get(0)+"");
    backpatch(((Eval)yyval).nextList,nextQuad());


  };
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 1018 of "YYParser.y"  */
    {
    System.out.println("SelectionStmt :  SWITCH_KW  END_KW  ");

  };
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 1023 of "YYParser.y"  */
    {
      yyval = new Eval();
      ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
      ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
      emit(Eval.gotoOp,"","","");
      ((Eval)yyval).falseList = new ArrayList<>();
      ((Eval)yyval).falseList.add(nextQuad()-1);      
};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 1033 of "YYParser.y"  */
    {
      yyval = new Eval();
      ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
      ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
      emit(Eval.ifOp,((Eval)(yystack.valueAt (1-(1)))).place,"","");
      emit(Eval.gotoOp,"","","");
      ((Eval)yyval).trueList = new ArrayList<>();
      ((Eval)yyval).falseList = new ArrayList<>();
      ((Eval)yyval).trueList.add(nextQuad()-2);
      ((Eval)yyval).falseList.add(nextQuad()-1);
  };
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 1046 of "YYParser.y"  */
    {
    System.out.println("CaseElement :   CASE_KW    NUMCONST : Statement ;");
      yyval = new Eval();
      ((Eval)yyval).declaredCases= new ArrayList<>();
      ((Eval)yyval).declaredCases.add(((Eval)(yystack.valueAt (8-(3)))));
      ((Eval)yyval).trueList=Eval.makeList(((Eval)(yystack.valueAt (8-(5)))).quad);
      ((Eval)yyval).falseList=Eval.makeList(((Eval)(yystack.valueAt (8-(8)))).quad);
      ((Eval)yyval).caseStartPoint=Eval.makeList(((Eval)(yystack.valueAt (8-(2)))).quad);
      ((Eval)yyval).nextList=Eval.makeList(((Eval)(yystack.valueAt (8-(8)))).quad);
      emit(Eval.gotoOp,"","",((Eval)yyval).nextList+"");
      ((Eval)yyval).breakList=((Eval)(yystack.valueAt (8-(6)))).breakList;
  };
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 1058 of "YYParser.y"  */
    {
    System.out.println("CaseElement : CaseElement  CASE_KW    NUMCONST : Statement ;");
    yyval = new Eval();
      ((Eval)yyval).declaredCases = ((Eval)(yystack.valueAt (9-(1)))).declaredCases;
      ((Eval)yyval).declaredCases.add(((Eval)(yystack.valueAt (9-(4)))));
      ((Eval)yyval).trueList = ((Eval)(yystack.valueAt (9-(1)))).trueList;
      ((Eval)yyval).trueList.add(((Eval)(yystack.valueAt (9-(6)))).quad);
      ((Eval)yyval).falseList=((Eval)(yystack.valueAt (9-(1)))).falseList;
      ((Eval)yyval).falseList.add(((Eval)(yystack.valueAt (9-(9)))).quad);
      ((Eval)yyval).caseStartPoint=((Eval)(yystack.valueAt (9-(1)))).caseStartPoint;
      ((Eval)yyval).caseStartPoint.add(((Eval)(yystack.valueAt (9-(3)))).quad);
      ((Eval)yyval).nextList=((Eval)(yystack.valueAt (9-(1)))).nextList;
      ((Eval)yyval).nextList.add(((Eval)(yystack.valueAt (9-(9)))).quad);
      emit(Eval.gotoOp,"","",((Eval)yyval).nextList+"");
      ((Eval)yyval).breakList=((Eval)(yystack.valueAt (9-(1)))).breakList;  
	  ((Eval)yyval).breakList=Eval.merge(((Eval)yyval).breakList,((Eval)(yystack.valueAt (9-(7)))).breakList);

  };
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 1077 of "YYParser.y"  */
    {
    System.out.println("DefaultElement :   DEFAULT_KW   : Statement ;");
    yyval = new Eval();  
    ((Eval)yyval).trueList=Eval.makeList(((Eval)(yystack.valueAt (6-(3)))).quad);
    emit(Eval.gotoOp,"","",((Eval)yyval).trueList+"");
    ((Eval)yyval).nextList=Eval.makeList(((Eval)(yystack.valueAt (6-(6)))).quad);
    emit(Eval.gotoOp,"","",((Eval)yyval).nextList+"");
    ((Eval)yyval).breakList=((Eval)(yystack.valueAt (6-(4)))).breakList;  
  };
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 1087 of "YYParser.y"  */
    {System.out.println("DefaultElement : lambda");};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 1091 of "YYParser.y"  */
    {
    System.out.println("ItereationStmt :   WHILE_KW   ( SimpleExpression ) Statement");
    yyval = new Eval();
    emit(Eval.gotoOp,"","",((Eval)(yystack.valueAt (7-(3)))).quad+"");
    backpatch(((Eval)(yystack.valueAt (7-(4)))).falseList,(((Eval)(yystack.valueAt (7-(7)))).quad+1));
    backpatch(((Eval)(yystack.valueAt (7-(4)))).trueList,((Eval)(yystack.valueAt (7-(5)))).quad);
    backpatch(((Eval)(yystack.valueAt (7-(6)))).breakList,(((Eval)(yystack.valueAt (7-(7)))).quad+1));

  };
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 1101 of "YYParser.y"  */
    {
    System.out.println("ReturnStmt :  RETURN_KW ;");
    //emit(Eval.gotoOp,"","","");
    yyval = new Eval();
    emit(Eval.assignOp,"","","targetLine");
    emit(Eval.variableGotoOp,"","","Call0");
    //((Eval)$$).nextList.add(nextQuad()-1);
    ((Eval)yyval).nextList.add(nextQuad()-2);
  };
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 1110 of "YYParser.y"  */
    {
    System.out.println("ReturnStmt :  RETURN_KW  Expression ;");
    yyval = new Eval();
    emit(Eval.assignOp,((Eval)(yystack.valueAt (3-(2)))).place,"","");//Assinment is : *arg1.place = result.place
    emit(Eval.assignOp,"","","targetLine");
    emit(Eval.variableGotoOp,"","","Call0");
    ((Eval)yyval).returnList.add(nextQuad()-3);
    ((Eval)yyval).nextList.add(nextQuad()-2);
    //((Eval)$$).nextList.add(nextQuad()-1);

  };
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 1122 of "YYParser.y"  */
    {
     System.out.println("BreakStmt :   BREAK_KW   ;");
    yyval = new Eval();
    emit(Eval.gotoOp,"","","");
    ((Eval)yyval).breakList= Eval.makeList(nextQuad()-1);

  };
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 1130 of "YYParser.y"  */
    {
    System.out.println("Expression  :   Mutable ASSIGN_KW Expression ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (3-(1)))).isArray;
    emit(Eval.assignOp,((Eval)(yystack.valueAt (3-(3)))).place,"",((Eval)(yystack.valueAt (3-(1)))).place);
  };
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 1138 of "YYParser.y"  */
    {
    System.out.println("Expression  :   Mutable MATH_OP_ASSIGN_KW Expression ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (3-(1)))).isArray;
    emit(mathOpAssignVal,((Eval)(yystack.valueAt (3-(3)))).place,"",((Eval)(yystack.valueAt (3-(1)))).place);
  };
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 1146 of "YYParser.y"  */
    {
    System.out.println("Expression  :   Mutable UNANRY_MATH_OP_KW Expression ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (2-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (2-(1)))).isArray;
    emit(unaryMathOpVal,"","",((Eval)yyval).place);
  };
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 1154 of "YYParser.y"  */
    {
    System.out.println("Expression  :   SimpleExpression ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 1163 of "YYParser.y"  */
    {
     System.out.println("SimpleExpression  :   SimpleExpression   OR_KW    SimpleExpression");
     if(((Eval)(yystack.valueAt (4-(1)))).type.equals(Eval.BOOL) && ((Eval)(yystack.valueAt (4-(4)))).type.equals(Eval.BOOL)){
       yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (4-(1)))).type,false,0);
        ((Eval)yyval).type = ((Eval)(yystack.valueAt (4-(4)))).type;
        String firtVal = convertToTrueFalseIfPossible(((Eval)(yystack.valueAt (4-(1)))).place);
        String secondVal = convertToTrueFalseIfPossible(((Eval)(yystack.valueAt (4-(3)))).place);
        emit(Eval.orOp,firtVal+"",secondVal+"",((Eval)yyval).place);
     }
     else if(((Eval)(yystack.valueAt (4-(1)))).type.equals(Eval.INT) || ((Eval)(yystack.valueAt (4-(4)))).type.equals(Eval.INT))
     {
        yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (4-(1)))).type,false,0);
        ((Eval)yyval).type = Eval.INT;
        emit(Eval.orOp,((Eval)(yystack.valueAt (4-(1)))).place,((Eval)(yystack.valueAt (4-(4)))).place,((Eval)yyval).place);
     }else{
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 1183 of "YYParser.y"  */
    {
     System.out.println("SimpleExpression :  SimpleExpression  AND_KW SimpleExpression");
     if(((Eval)(yystack.valueAt (4-(1)))).type.equals(Eval.BOOL) && ((Eval)(yystack.valueAt (4-(4)))).type.equals(Eval.BOOL)){
        yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (4-(1)))).type,false,0);
        ((Eval)yyval).type = ((Eval)(yystack.valueAt (4-(1)))).type;
        String firtVal = ((Eval)(yystack.valueAt (4-(1)))).place;
        String secondVal = ((Eval)(yystack.valueAt (4-(4)))).place;
        firtVal = convertToTrueFalseIfPossible(firtVal);
        secondVal = convertToTrueFalseIfPossible(secondVal);
        emit(Eval.andOp,firtVal+"",secondVal+"",((Eval)yyval).place);
     }
     else if(((Eval)(yystack.valueAt (4-(1)))).type.equals(Eval.INT) || ((Eval)(yystack.valueAt (4-(4)))).type.equals(Eval.INT))
     {
        yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (4-(1)))).type,false,0);
        ((Eval)yyval).type = Eval.INT;
        emit(Eval.andOp,((Eval)(yystack.valueAt (4-(1)))).place,((Eval)(yystack.valueAt (4-(4)))).place,((Eval)yyval).place);
     }
     else
     {
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 1208 of "YYParser.y"  */
    {
     System.out.println("SimpleExpression  :  SimpleExpression   SimpleExpression  OrElseRel");
     if(((Eval)(yystack.valueAt (2-(1)))).type.equals(Eval.BOOL) && ((Eval)(yystack.valueAt (2-(2)))).type.equals(Eval.BOOL)){
       yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(1)))).type,false,0);
        ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(1)))).type;
        String firtVal = convertToTrueFalseIfPossible(((Eval)(yystack.valueAt (2-(1)))).place);
        String secondVal = convertToTrueFalseIfPossible(((Eval)(yystack.valueAt (2-(2)))).place);
        emit(Eval.assignOp,firtVal,"",((Eval)yyval).place);
        emit(Eval.ifOp,firtVal,"",(nextQuad()+2)+"");
        emit(Eval.orOp,firtVal+"",secondVal+"",((Eval)yyval).place);
     }
     else if(((Eval)(yystack.valueAt (2-(1)))).type.equals(Eval.INT) || ((Eval)(yystack.valueAt (2-(2)))).type.equals(Eval.INT))
     {
        yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(1)))).type,false,0);
        ((Eval)yyval).type = Eval.INT;
        emit(Eval.assignOp,((Eval)(yystack.valueAt (2-(1)))).place,"",((Eval)yyval).place);
        emit(Eval.ifOp,((Eval)(yystack.valueAt (2-(1)))).place,"",(nextQuad()+2)+"");
        emit(Eval.orOp,((Eval)(yystack.valueAt (2-(1)))).place,((Eval)(yystack.valueAt (2-(2)))).place,((Eval)yyval).place);
     }else{
       System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
     }
  };
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 1232 of "YYParser.y"  */
    {
    System.out.println("SimpleExpression  :  SimpleExpression  SimpleExpression  AndThenRel");
    if(((Eval)(yystack.valueAt (2-(1)))).type.equals(Eval.BOOL) && ((Eval)(yystack.valueAt (2-(2)))).type.equals(Eval.BOOL)){
       yyval = new Eval();
       ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(1)))).type,false,0);
       ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(1)))).type;
       String firtVal = ((Eval)(yystack.valueAt (2-(1)))).place;
       String secondVal = ((Eval)(yystack.valueAt (2-(2)))).place;
       firtVal = convertToTrueFalseIfPossible(firtVal);
       secondVal = convertToTrueFalseIfPossible(secondVal);
       emit(Eval.assignOp,firtVal,"",((Eval)yyval).place);
       emit(Eval.ifOp,"!"+firtVal,"",(nextQuad()+2)+"");
       emit(Eval.andOp,firtVal+"",secondVal+"",((Eval)yyval).place);
    }
    else if(((Eval)(yystack.valueAt (2-(1)))).type.equals(Eval.INT) || ((Eval)(yystack.valueAt (2-(2)))).type.equals(Eval.INT))
    {
       yyval = new Eval();
       ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(1)))).type,false,0);
       ((Eval)yyval).type = Eval.INT;
       emit(Eval.assignOp,((Eval)(yystack.valueAt (2-(1)))).place,"",((Eval)yyval).place);
       emit(Eval.ifOp,"!"+((Eval)(yystack.valueAt (2-(1)))).place,"",(nextQuad()+2)+"");
       emit(Eval.andOp,((Eval)(yystack.valueAt (2-(1)))).place,((Eval)(yystack.valueAt (2-(2)))).place,((Eval)yyval).place);
    }
    else
    {
      System.out.println(ANSI_RED+"Error:Type not found"+ANSI_RESET);
    }
  };
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 1260 of "YYParser.y"  */
    {
    System.out.println("SimpleExpression  :   NOT_KW   SimpleExpression");
    if(((Eval)(yystack.valueAt (2-(2)))).type.equals(Eval.BOOL)){
         yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(2)))).type,false,0);
        ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(2)))).type;
        emit(Eval.notOp,((Eval)(yystack.valueAt (2-(2)))).place,"",((Eval)yyval).place);
     }
  };
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 1269 of "YYParser.y"  */
    {
    System.out.println("SimpleExpression  :  RelExpression");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 1277 of "YYParser.y"  */
    {
    System.out.println("OrElseRel : OR_KW  ELSE_KW   RelExpression");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(3)))).place;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 1285 of "YYParser.y"  */
    {
    System.out.println("AndThenRel  : AND_KW  THEN_KW    RelExpression; ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(3)))).place;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 1293 of "YYParser.y"  */
    {
    System.out.println("RelExpression  :   MathLogicExpression   REL_OP_KW    MathLogicExpression");
    yyval = new Eval();
    String value = newTemp(Eval.BOOL,false,-1);
    emit(relOpVal,((Eval)(yystack.valueAt (3-(1)))).place,((Eval)(yystack.valueAt (3-(3)))).place,value);
    ((Eval)yyval).type = Eval.BOOL;
    ((Eval)yyval).place = value;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 1302 of "YYParser.y"  */
    {
    System.out.println("RelExpression  :   MathLogicExpression");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 1310 of "YYParser.y"  */
    {
    System.out.println("ASSIGNED_MATH_OP : MATH_OP_KW");
    yyval = new Eval();
    ((Eval)yyval).type = Eval.unknownType;
    ((Eval)yyval).place = mathOpVal;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 1318 of "YYParser.y"  */
    {
    System.out.println("MathLogicExpression  :   MathLogicExpression   MATH_OP_KW    MathLogicExpression");
    if((((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.INT) && ((Eval)(yystack.valueAt (3-(3)))).type.equals(Eval.INT))||(((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.REAL) && ((Eval)(yystack.valueAt (3-(3)))).type.equals(Eval.REAL))){
        yyval = new Eval();
        ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (3-(3)))).type,false,0);
        ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
        emit(((Eval)(yystack.valueAt (3-(2)))).place,((Eval)(yystack.valueAt (3-(1)))).place,((Eval)(yystack.valueAt (3-(3)))).place,((Eval)yyval).place);
    }
    else if(((Eval)(yystack.valueAt (3-(1)))).type==Eval.INT && ((Eval)(yystack.valueAt (3-(3)))).type==Eval.REAL){
      yyval = new Eval();
      ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (3-(3)))).type,false,0);
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
      String var = newTemp(((Eval)(yystack.valueAt (3-(1)))).type,false,0);
      emit(Eval.castOP,((Eval)(yystack.valueAt (3-(1)))).place,Eval.REAL,var);
      emit(((Eval)(yystack.valueAt (3-(2)))).place,((Eval)(yystack.valueAt (3-(1)))).place,((Eval)(yystack.valueAt (3-(3)))).place,((Eval)yyval).place);
    }
    else if(((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.REAL) && ((Eval)(yystack.valueAt (3-(3)))).type.equals(Eval.INT)){
      yyval = new Eval();
      ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (3-(3)))).type,false,0);
      ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(3)))).type;
      String var = newTemp(((Eval)(yystack.valueAt (3-(3)))).type,false,0);
      emit(Eval.castOP,((Eval)(yystack.valueAt (3-(3)))).place,Eval.REAL,var);
      emit(((Eval)(yystack.valueAt (3-(2)))).place,((Eval)(yystack.valueAt (3-(1)))).place,((Eval)(yystack.valueAt (3-(3)))).place,((Eval)yyval).place);
    }else if((((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.BOOL) && (!((Eval)(yystack.valueAt (3-(3)))).type.equals(Eval.unknownType)))
    || (((Eval)(yystack.valueAt (3-(3)))).type.equals(Eval.BOOL) && (!((Eval)(yystack.valueAt (3-(1)))).type.equals(Eval.unknownType)))){
      yyval = new Eval();
      ((Eval)yyval).place = newTemp(Eval.INT,false,0);
      ((Eval)yyval).type = Eval.INT;
      emit(((Eval)(yystack.valueAt (3-(2)))).place,((Eval)(yystack.valueAt (3-(1)))).place,((Eval)(yystack.valueAt (3-(3)))).place,((Eval)yyval).place);
    }else {
      System.out.println(ANSI_RED+"Error:Unknow type detected: "+((Eval)(yystack.valueAt (3-(1)))).type+":"+((Eval)(yystack.valueAt (3-(2)))).place+":"+((Eval)(yystack.valueAt (3-(3)))).type+ANSI_RESET);
    }
  };
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 1351 of "YYParser.y"  */
    {
    System.out.println("MathLogicExpression  :   UnaryExpression");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 1359 of "YYParser.y"  */
    {
    System.out.println("UnaryExpression  :    UNARY_OP_KW    UnaryExpression");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (2-(2)))).type;
    ((Eval)yyval).place = newTemp(((Eval)(yystack.valueAt (2-(2)))).type,((Eval)(yystack.valueAt (2-(2)))).isArray,((Eval)(yystack.valueAt (2-(2)))).size);
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (2-(2)))).isArray;
    emit(unaryOpVal,((Eval)(yystack.valueAt (2-(2)))).place,"",((Eval)yyval).place);
  };
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 1367 of "YYParser.y"  */
    {
    System.out.println("UnaryExpression  :   Factor");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 1375 of "YYParser.y"  */
    {
    System.out.println("Factor  :   Mutable");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 1382 of "YYParser.y"  */
    {
    System.out.println("Factor  :   Immutable");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 1390 of "YYParser.y"  */
    {
    System.out.println("Mutable  :   ID ");
    yyval = new Eval();
    SymbolTable.Record symbol=symbolTable.getSymbol(((Eval)(yystack.valueAt (1-(1)))).place);
    if(symbol!=null){
      ((Eval)yyval).type = symbol.type;
      ((Eval)yyval).place = symbol.name;
      ((Eval)yyval).isArray = symbol.isArray;
    }else {
      System.out.println(ANSI_RED+"Error:symbol not declared"+ANSI_RESET);
    }
  };
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 1402 of "YYParser.y"  */
    {
    System.out.println("Mutable [ Expression ]");
    yyval = new Eval();
    SymbolTable.Record symbol=symbolTable.getSymbol(((Eval)(yystack.valueAt (4-(1)))).place);
    if(symbol!=null ){
      String place2 = "";
      // SymbolTable.Record ArrIndex=symbolTable.getSymbol($3.place);
      // if(ArrIndex!=null){
      //   place2 = ArrIndex.name;
      // }else {
      //   place2 = $3.place;
      // }
      place2 = ((Eval)(yystack.valueAt (4-(3)))).place;
      // if(symbol.size<=$3.place){
      //   System.out.println(ANSI_RED+"Array out of index exception may happen:"+"Array:"+$1.place+" Index is:"+$3.place+ANSI_RESET);
      // }
      ((Eval)yyval).type = symbol.type;
      ((Eval)yyval).place = symbol.name+"["+place2+"]";
      ((Eval)yyval).isArray = symbol.isArray;
    }else {
      System.out.println(ANSI_RED+"Error:symbol not declared"+ANSI_RESET);
    }

  };
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 351 of lalr1.java  */
/* Line 1426 of "YYParser.y"  */
    {System.out.println("Mutable . ID ");};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 351 of lalr1.java  */
/* Line 1428 of "YYParser.y"  */
    {
    System.out.println("Immutable  :  ( Expression ) ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (3-(2)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (3-(2)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (3-(2)))).isArray;
  };
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 351 of lalr1.java  */
/* Line 1435 of "YYParser.y"  */
    {
    System.out.println("Immutable  :  Call ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 351 of lalr1.java  */
/* Line 1442 of "YYParser.y"  */
    {
    System.out.println("Immutable  :  Constant ");
    yyval = new Eval();
    ((Eval)yyval).type = ((Eval)(yystack.valueAt (1-(1)))).type;
    ((Eval)yyval).place = ((Eval)(yystack.valueAt (1-(1)))).place;
    ((Eval)yyval).isArray = ((Eval)(yystack.valueAt (1-(1)))).isArray;
  };
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 351 of lalr1.java  */
/* Line 1450 of "YYParser.y"  */
    {
    System.out.println("Call  :   ID ( Args ) ");
    yyval = new Eval();
    for(int i=0;i<((Eval)(yystack.valueAt (4-(3)))).argsList.size();i++){
      emit(Eval.stackPush,"","",((Eval)(yystack.valueAt (4-(3)))).argsList.get(i).place);
    }
    emit(Eval.stackPush,"","",(nextQuad()+2)+"");
    callTable.addNewCall(nextQuad()+1,"Line"+(nextQuad()+1));
    ScopeRecord scopeRecord=scopeTable.getByName(((Eval)(yystack.valueAt (4-(1)))).place);
    if(scopeRecord==null){
      System.out.println(ANSI_RED+"Error:Function not found"+ANSI_RESET);
      ((Eval)yyval).place = scopeRecord.returnValue;
      ((Eval)yyval).type = Eval.unknownType;
    }else{
      emit(Eval.gotoOp,"","",scopeRecord.startLine);
      ((Eval)yyval).place = scopeRecord.returnValue;
      ((Eval)yyval).type = scopeRecord.returnType;
    }
  };
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 351 of lalr1.java  */
/* Line 1470 of "YYParser.y"  */
    {
    System.out.println("Args  :   ArgList");
    yyval = new Eval();
    ((Eval)yyval).argsList = ((Eval)(yystack.valueAt (1-(1)))).argsList; 
  };
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 351 of lalr1.java  */
/* Line 1475 of "YYParser.y"  */
    {
    System.out.println("  Args  :  lambda");
    yyval = new Eval();
  };
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 351 of lalr1.java  */
/* Line 1480 of "YYParser.y"  */
    {
    System.out.println("ArgList  :   ArgList , Expression");
    yyval = new Eval();
    ((Eval)yyval).argsList = ((Eval)(yystack.valueAt (3-(1)))).argsList;
    ((Eval)yyval).argsList.add(((Eval)(yystack.valueAt (3-(3)))));
  };
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 351 of lalr1.java  */
/* Line 1486 of "YYParser.y"  */
    {
    System.out.println("ArgList  :  Expression");
    yyval = new Eval();
    ((Eval)yyval).argsList.add(((Eval)(yystack.valueAt (1-(1)))));
  };
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 351 of lalr1.java  */
/* Line 1492 of "YYParser.y"  */
    {
    System.out.println("Constant  :   NUMCONST");
    yyval = new Eval();
    ((Eval)yyval).type = Eval.INT;
    ((Eval)yyval).place = intVal;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 351 of lalr1.java  */
/* Line 1499 of "YYParser.y"  */
    {
    System.out.println("Constant  :   REALCONST");
    yyval = new Eval();
    ((Eval)yyval).type = Eval.REAL;
    ((Eval)yyval).place = realVal;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 351 of lalr1.java  */
/* Line 1506 of "YYParser.y"  */
    {
    System.out.println("Constant  :   CHARCONST");
    yyval = new Eval();
    ((Eval)yyval).type = Eval.CHAR;
    ((Eval)yyval).place = realVal;
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 351 of lalr1.java  */
/* Line 1513 of "YYParser.y"  */
    {
    System.out.println("Constant  :   BOOL_KW");
    yyval = new Eval();
    ((Eval)yyval).type = Eval.BOOL;
    if(boolVal.equals("true")){
      ((Eval)yyval).place = "1";
    }else{
      ((Eval)yyval).place = "0";
    }
    ((Eval)yyval).isArray = false;
  };
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 351 of lalr1.java  */
/* Line 1525 of "YYParser.y"  */
    {
      yyval = new Eval();
      ((Eval)yyval).place = idVal;
      ((Eval)yyval).type = Eval.unknownType;
  };
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 351 of lalr1.java  */
/* Line 1532 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).quad = nextQuad();
  };
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 351 of lalr1.java  */
/* Line 1537 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).quad = nextQuad();
  };
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 351 of lalr1.java  */
/* Line 1542 of "YYParser.y"  */
    {
    yyval = new Eval();
    ((Eval)yyval).symbolTableQuad = symbolTable.getSize();
    ((Eval)yyval).quad = nextQuad();
  };
  break;
    



/* Line 351 of lalr1.java  */
/* Line 2282 of "YYParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -142;
  private static final short yypact_[] =
  {
         6,  -142,    23,  -142,    47,     6,  -142,  -142,  -142,    23,
    -142,  -142,   250,     4,    11,  -142,  -142,  -142,    15,  -142,
      25,   -23,  -142,  -142,  -142,  -142,   121,    27,    -9,    36,
      55,   145,    14,  -142,   179,   121,  -142,  -142,  -142,  -142,
    -142,  -142,  -142,    61,  -142,    28,     3,  -142,  -142,   186,
    -142,  -142,  -142,    40,    16,    52,  -142,    23,   121,    93,
      16,  -142,   -20,   121,  -142,   121,  -142,  -142,  -142,  -142,
      67,    16,  -142,  -142,    23,  -142,  -142,    69,   216,   250,
      -5,    66,  -142,  -142,    97,    98,  -142,  -142,   145,  -142,
     145,  -142,   121,   121,   121,    23,   121,    23,  -142,    80,
    -142,  -142,   108,  -142,    23,  -142,    83,  -142,    87,    66,
      66,  -142,    66,  -142,   121,  -142,  -142,    51,  -142,  -142,
     250,  -142,  -142,  -142,   121,   121,   121,   121,   104,  -142,
    -142,  -142,   102,  -142,  -142,    66,    82,   103,  -142,   109,
      66,    16,  -142,  -142,    63,  -142,  -142,   250,   132,    66,
    -142,  -142,  -142,  -142,  -142,  -142,  -142,   121,    23,   118,
    -142,  -142,  -142,   144,  -142,   139,   250,  -142,  -142,  -142,
    -142,    70,  -142,   140,  -142,   250,   120,    70,   123,   147,
    -142,  -142,  -142,   125,  -142,  -142,   250,  -142,   250,  -142,
     134,   250,   136,  -142,   141,  -142,  -142,  -142,  -142,  -142
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,   105,     0,    23,     0,     2,     4,     5,     7,     0,
      24,     6,     0,    25,     0,    25,     1,     3,     0,    16,
      17,    19,   104,   101,   103,   102,     0,     0,     0,     0,
       0,     0,     0,    54,     0,     0,   108,    39,    38,    40,
      41,    42,    43,     0,    72,    78,    82,    85,    87,    88,
      89,    94,    95,    90,    30,     0,     8,     0,     0,     0,
      30,    77,    88,     0,    58,     0,   107,    68,    86,    66,
       0,     0,    44,    50,     0,    22,    52,     0,    48,    47,
      90,     0,    26,    53,   107,   107,    75,    76,     0,    83,
       0,    71,     0,     0,     0,     0,    98,     0,   108,    29,
      32,    10,     0,    12,     0,    15,    19,    18,     0,     0,
       0,    60,     0,    59,     0,    67,    21,     0,    45,    49,
      46,    51,   106,    93,     0,     0,     0,     0,    81,    84,
      70,    69,     0,    92,   100,     0,    97,    33,    35,    36,
       0,     0,     9,    11,     0,    20,    27,     0,     0,     0,
      14,    79,    73,    80,    74,    91,    96,     0,     0,     0,
      28,    31,    13,    55,   107,   107,     0,    99,    34,    37,
     107,     0,   107,    64,   107,     0,     0,     0,     0,     0,
      65,    56,   107,     0,   107,   107,     0,   107,     0,    57,
       0,     0,     0,   107,     0,   107,    61,   107,    63,    62
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -142,  -142,  -142,   166,  -142,  -142,  -142,    76,   110,   -66,
     124,  -142,   -53,     9,   185,  -142,  -142,   133,  -142,    54,
    -142,    38,   -12,  -142,  -142,  -142,   119,  -142,  -142,  -142,
      84,  -142,  -142,  -142,  -142,  -142,   -28,    13,  -142,  -142,
    -142,  -142,   113,   -16,  -142,    58,  -142,  -142,  -142,  -142,
    -141,     1,   -92,   -73,   106
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     4,     5,     6,     7,     8,   102,   103,    73,    18,
      19,    20,    74,    75,    10,    11,    12,    98,    99,   100,
     137,   138,    76,    37,    77,    78,    79,    38,    39,   112,
     110,   165,   179,    40,    41,    42,    43,    44,    86,    87,
      45,    90,    46,    47,    48,    49,    50,    51,   135,   136,
      52,    53,   123,   114,    82
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -26;
  private static final short
  yytable_[] =
  {
        36,    13,   104,    15,    70,   -25,    13,    81,   117,     9,
      21,   125,   127,    64,     9,    68,     1,   146,   147,    59,
     148,    22,    94,    60,     1,    23,     1,    24,    95,    25,
     176,    88,    89,     1,    26,    80,   183,    65,   144,    61,
       2,    96,     3,   156,    84,    85,    31,    16,   160,   104,
      54,    55,     3,    69,    56,    15,    15,   166,   106,    57,
      35,    15,     1,    97,   130,   131,   132,   121,   134,    97,
      58,   107,    15,    63,   129,   106,   111,    22,   113,    80,
     116,    23,    66,    24,    62,    25,    96,    71,     3,    62,
     150,   171,   173,   101,    67,    57,   133,   175,   139,   177,
      83,   180,   162,    15,   108,   106,   115,    57,   121,   186,
     118,   188,   189,   122,   191,   124,    62,   126,     1,   141,
     196,    62,   198,    62,   199,    59,   157,   111,    22,   167,
     145,     1,    23,    89,    24,   163,    25,   151,   152,   153,
     154,    26,    15,    71,     3,   155,    62,   158,    62,   142,
      97,   159,    22,    31,   174,     1,    23,   164,    24,   139,
      25,   169,   170,   181,   172,   182,   178,    35,   184,   185,
     187,    17,    62,   193,   190,   195,   192,    31,   143,   194,
     197,   105,    62,    62,    62,    62,    22,    14,   119,     1,
      23,    35,    24,   109,    25,   161,   168,   120,   149,    26,
      27,   128,    28,    29,   140,     0,    30,     0,     0,     0,
       0,    31,    32,     0,    71,     3,    91,    92,    33,    34,
      72,     0,     0,    22,    93,    35,     1,    23,    94,    24,
       0,    25,     0,     0,    95,     0,    26,    27,     0,    28,
      29,     0,     0,    30,     0,     0,     0,     0,    31,    32,
       0,    71,     3,     0,     0,    33,    34,    22,     0,     0,
       1,    23,    35,    24,     0,    25,     0,     0,     0,     0,
      26,    27,     0,    28,    29,     0,     0,    30,     0,     0,
       0,     0,    31,    32,     0,     0,     0,     0,     0,    33,
      34,     0,     0,     0,     0,     0,    35
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        12,     0,    55,     2,    32,    10,     5,    35,    74,     0,
       9,    84,    85,    22,     5,    31,    10,   109,   110,    42,
     112,     7,    42,    46,    10,    11,    10,    13,    48,    15,
     171,    28,    29,    10,    20,    34,   177,    46,   104,    26,
      34,    46,    36,   135,    16,    17,    32,     0,   140,   102,
      46,    40,    36,    39,    39,    54,    55,   149,    57,    44,
      46,    60,    10,    54,    92,    93,    94,    79,    96,    60,
      45,    58,    71,    46,    90,    74,    63,     7,    65,    78,
      71,    11,    46,    13,    26,    15,    46,    35,    36,    31,
      39,   164,   165,    41,    39,    44,    95,   170,    97,   172,
      39,   174,    39,   102,    11,   104,    39,    44,   120,   182,
      41,   184,   185,    47,   187,    18,    58,    19,    10,    39,
     193,    63,   195,    65,   197,    42,    44,   114,     7,   157,
      43,    10,    11,    29,    13,   147,    15,   124,   125,   126,
     127,    20,   141,    35,    36,    43,    88,    44,    90,    41,
     141,    42,     7,    32,   166,    10,    11,    25,    13,   158,
      15,    43,    18,   175,    25,    45,    26,    46,    45,    22,
      45,     5,   114,    39,   186,    39,   188,    32,   102,   191,
      39,    57,   124,   125,   126,   127,     7,     2,    78,    10,
      11,    46,    13,    60,    15,   141,   158,    78,   114,    20,
      21,    88,    23,    24,    98,    -1,    27,    -1,    -1,    -1,
      -1,    32,    33,    -1,    35,    36,    30,    31,    39,    40,
      41,    -1,    -1,     7,    38,    46,    10,    11,    42,    13,
      -1,    15,    -1,    -1,    48,    -1,    20,    21,    -1,    23,
      24,    -1,    -1,    27,    -1,    -1,    -1,    -1,    32,    33,
      -1,    35,    36,    -1,    -1,    39,    40,     7,    -1,    -1,
      10,    11,    46,    13,    -1,    15,    -1,    -1,    -1,    -1,
      20,    21,    -1,    23,    24,    -1,    -1,    27,    -1,    -1,
      -1,    -1,    32,    33,    -1,    -1,    -1,    -1,    -1,    39,
      40,    -1,    -1,    -1,    -1,    -1,    46
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    10,    34,    36,    58,    59,    60,    61,    62,    70,
      71,    72,    73,   108,    71,   108,     0,    60,    66,    67,
      68,   108,     7,    11,    13,    15,    20,    21,    23,    24,
      27,    32,    33,    39,    40,    46,    79,    80,    84,    85,
      90,    91,    92,    93,    94,    97,    99,   100,   101,   102,
     103,   104,   107,   108,    46,    40,    39,    44,    45,    42,
      46,    94,   102,    46,    22,    46,    46,    39,   100,    39,
      93,    35,    41,    65,    69,    70,    79,    81,    82,    83,
     108,    93,   111,    39,    16,    17,    95,    96,    28,    29,
      98,    30,    31,    38,    42,    48,    46,    70,    74,    75,
      76,    41,    63,    64,    69,    67,   108,    94,    11,    74,
      87,    94,    86,    94,   110,    39,    70,    66,    41,    65,
      83,    79,    47,   109,    18,   110,    19,   110,    99,   100,
      93,    93,    93,   108,    93,   105,   106,    77,    78,   108,
     111,    39,    41,    64,    66,    43,   109,   109,   109,    87,
      39,    94,    94,    94,    94,    43,   109,    44,    44,    42,
     109,    76,    39,    79,    25,    88,   109,    93,    78,    43,
      18,   110,    25,   110,    79,   110,   107,   110,    26,    89,
     110,    79,    45,   107,    45,    22,   110,    45,   110,   110,
      79,   110,    79,    39,    79,    39,   110,    39,   110,   110
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    57,    58,    59,    59,    60,    60,    60,    61,    62,
      62,    63,    63,    64,    65,    66,    66,    67,    67,    68,
      68,    69,    69,    70,    70,    71,    72,    73,    73,    74,
      74,    75,    75,    76,    77,    77,    78,    78,    79,    79,
      79,    79,    79,    79,    80,    80,    81,    81,    81,    82,
      82,    83,    83,    84,    84,    85,    85,    85,    85,    86,
      87,    88,    88,    89,    89,    90,    91,    91,    92,    93,
      93,    93,    93,    94,    94,    94,    94,    94,    94,    95,
      96,    97,    97,    98,    99,    99,   100,   100,   101,   101,
     102,   102,   102,   103,   103,   103,   104,   105,   105,   106,
     106,   107,   107,   107,   107,   108,   109,   110,   111
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     1,     2,     1,     1,     1,     1,     3,     5,
       4,     2,     1,     3,     3,     3,     1,     1,     3,     1,
       4,     2,     1,     1,     1,     1,     3,     5,     5,     1,
       0,     3,     1,     2,     3,     1,     1,     3,     1,     1,
       1,     1,     1,     1,     2,     3,     2,     1,     1,     2,
       1,     2,     1,     2,     1,     5,     8,     9,     2,     1,
       1,     8,     9,     6,     0,     7,     2,     3,     2,     3,
       3,     2,     1,     4,     4,     2,     2,     2,     1,     3,
       3,     3,     1,     1,     3,     1,     2,     1,     1,     1,
       1,     4,     3,     3,     1,     1,     4,     1,     0,     3,
       1,     1,     1,     1,     1,     1,     1,     0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "LETTER", "DIGIT", "NON_ZERO_DIGIT",
  "HASH_KW", "BOOL_KW", "WHITE_SPACE", "LETDIG", "ID_KW", "NUMCONST",
  "WITHOUT_N", "CHARCONST", "COMMENT", "REALCONST", "OR_KW", "AND_KW",
  "ELSE_KW", "THEN_KW", "NOT_KW", "IF_KW", "END_KW", "SWITCH_KW",
  "WHILE_KW", "CASE_KW", "DEFAULT_KW", "BREAK_KW", "REL_OP_KW",
  "MATH_OP_KW", "UNARY_MATH_OP_KW", "MATH_OP_ASSIGN_KW", "UNARY_OP_KW",
  "RETURN_KW", "RECORD_KW", "STATIC_KW", "TYPESPECIFIER_KW", "PUNC_KW",
  "ASSIGN_KW", "SEMI_COLUMN_KW", "LEFTAC", "RIGHTAC", "LEFTAR", "RIGHTAR",
  "COLUMN", "TWO_COLUMN", "LEFTPA", "RIGHTPA", "DOT_KW", "NOT",
  "\"simpleOr\"", "\"simpleAnd\"", "\"andThen\"", "\"orElse\"", "\"then\"",
  "\"oneCase\"", "\"manyCase\"", "$accept", "Program", "DeclarationList",
  "Declaration", "VarDeclaration", "RecDeclaration",
  "RecLocalDeclarations", "RecScopedVarDelaration", "ScopedVarDelaration",
  "VarDeclList", "VarDeclInitialize", "VarDeclId", "ScopedTypeSpecifer",
  "TypeSpecifier", "Rectype", "FunDeclaration", "FunPart", "Params",
  "ParamList", "ParamTypeList", "ParamIdList", "ParamId", "Statement",
  "CompoundStmt", "Combo", "LocalDeclarations", "StatementList",
  "ExpressionStmt", "SelectionStmt", "SwitchExpression", "IfExpression",
  "CaseElement", "DefaultElement", "ItereationStmt", "ReturnStmt",
  "BreakStmt", "Expression", "SimpleExpression", "OrElseRel", "AndThenRel",
  "RelExpression", "ASSIGNED_MATH_OP", "MathLogicExpression",
  "UnaryExpression", "Factor", "Mutable", "Immutable", "Call", "Args",
  "ArgList", "Constant", "ID", "rightPaQ", "M", "N", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        58,     0,    -1,    59,    -1,    59,    60,    -1,    60,    -1,
      61,    -1,    72,    -1,    62,    -1,    70,    66,    39,    -1,
      34,    71,    40,    63,    41,    -1,    34,    71,    40,    41,
      -1,    63,    64,    -1,    64,    -1,    69,    66,    39,    -1,
      69,    66,    39,    -1,    66,    44,    67,    -1,    67,    -1,
      68,    -1,    68,    45,    94,    -1,   108,    -1,   108,    42,
      11,    43,    -1,    35,    70,    -1,    70,    -1,    36,    -1,
      71,    -1,   108,    -1,    73,    79,   111,    -1,    70,   108,
      46,    74,   109,    -1,   108,    46,    74,   111,   109,    -1,
      75,    -1,    -1,    75,    39,    76,    -1,    76,    -1,    70,
      77,    -1,    77,    44,    78,    -1,    78,    -1,   108,    -1,
     108,    42,    43,    -1,    84,    -1,    80,    -1,    85,    -1,
      90,    -1,    91,    -1,    92,    -1,    40,    41,    -1,    40,
      81,    41,    -1,    82,    83,    -1,    83,    -1,    82,    -1,
      82,    65,    -1,    65,    -1,    83,    79,    -1,    79,    -1,
      93,    39,    -1,    39,    -1,    21,    46,    87,   109,    79,
      -1,    21,    46,    87,   109,    79,    18,   110,    79,    -1,
      23,    46,    86,   109,    88,   110,    89,    22,   110,    -1,
      23,    22,    -1,    94,    -1,    94,    -1,    25,   110,   107,
      45,   110,    79,    39,   110,    -1,    88,    25,   110,   107,
      45,   110,    79,    39,   110,    -1,    26,    45,   110,    79,
      39,   110,    -1,    -1,    24,    46,   110,    87,   109,    79,
     110,    -1,    33,    39,    -1,    33,    93,    39,    -1,    27,
      39,    -1,   102,    38,    93,    -1,   102,    31,    93,    -1,
     102,    30,    -1,    94,    -1,    97,    16,   110,    94,    -1,
      97,    17,   110,    94,    -1,    97,    95,    -1,    97,    96,
      -1,    20,    94,    -1,    97,    -1,    16,    18,    94,    -1,
      17,    19,    94,    -1,    99,    28,    99,    -1,    99,    -1,
      29,    -1,    99,    98,   100,    -1,   100,    -1,    32,   100,
      -1,   101,    -1,   102,    -1,   103,    -1,   108,    -1,   102,
      42,    93,    43,    -1,   102,    48,   108,    -1,    46,    93,
     109,    -1,   104,    -1,   107,    -1,   108,    46,   105,   109,
      -1,   106,    -1,    -1,   106,    44,    93,    -1,    93,    -1,
      11,    -1,    15,    -1,    13,    -1,     7,    -1,    10,    -1,
      47,    -1,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     5,     8,    10,    12,    14,    16,    20,
      26,    31,    34,    36,    40,    44,    48,    50,    52,    56,
      58,    63,    66,    68,    70,    72,    74,    78,    84,    90,
      92,    93,    97,    99,   102,   106,   108,   110,   114,   116,
     118,   120,   122,   124,   126,   129,   133,   136,   138,   140,
     143,   145,   148,   150,   153,   155,   161,   170,   180,   183,
     185,   187,   196,   206,   213,   214,   222,   225,   229,   232,
     236,   240,   243,   245,   250,   255,   258,   261,   264,   266,
     270,   274,   278,   280,   282,   286,   288,   291,   293,   295,
     297,   299,   304,   308,   312,   314,   316,   321,   323,   324,
     328,   330,   332,   334,   336,   338,   340,   342,   343
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   431,   431,   435,   438,   441,   458,   462,   464,   500,
     506,   512,   519,   525,   575,   619,   627,   635,   643,   654,
     661,   670,   677,   685,   701,   709,   719,   746,   779,   808,
     813,   818,   824,   830,   853,   862,   870,   877,   887,   891,
     898,   905,   910,   916,   922,   926,   934,   941,   948,   953,
     954,   956,   966,   974,   975,   977,   987,   994,  1018,  1023,
    1033,  1046,  1058,  1077,  1087,  1090,  1101,  1110,  1122,  1130,
    1138,  1146,  1154,  1163,  1183,  1208,  1232,  1260,  1269,  1277,
    1285,  1293,  1302,  1310,  1318,  1351,  1359,  1367,  1375,  1382,
    1390,  1402,  1426,  1428,  1435,  1442,  1450,  1470,  1475,  1480,
    1486,  1492,  1499,  1506,  1513,  1525,  1531,  1537,  1542
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 296;
  private static final int yynnts_ = 55;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 16;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 57;

  private static final int yyuser_token_number_max_ = 311;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 927 of lalr1.java  */
/* Line 60 of "YYParser.y"  */

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




/* Line 927 of lalr1.java  */
/* Line 3452 of "YYParser.java"  */

}


/* Line 931 of lalr1.java  */
/* Line 1547 of "YYParser.y"  */

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
