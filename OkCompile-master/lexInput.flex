/* --------------------------Usercode Section------------------------ */
import java_cup.runtime.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java_cup.*;
import java.io.*;
import java.util.*;

%%
/* -----------------Options and Declarations Section----------------- */
/*
   The name of the class JFlex will create will be Lexer.
   Will write the code to the file Lexer.java.
*/
%class JLex

/*
  The current line number can be accessed with the variable yyline
  and the current column number with the variable yycolumn.
*/
%line
%column
//%standalone//For making file to generate main automatically
/*
   Will switch to a CUP compatibility mode to interface with a CUP
   generated parser.
*/
//%cup

/*
  Declarations

  Code between %{ and %}, both of which must be at the beginning of a
  line, will be copied letter to letter into the lexer class source.
  Here you declare member variables and functions that are used inside
  scanner actions.
*/
%{
  // private List<String> symbolTable;
  // private int addSymbol(String symbol)
  // {
  //   if(symbolTable==null){
  //     symbolTable = new ArrayList<String>();
  //   }
  //   for(int i=0;i<symbolTable.size();i++){
  //       if(symbol.equals(symbolTable.get(i))){
  //           return i;
  //       }
  //   }
  //   symbolTable.add(symbol);
  //   return symbolTable.size()-1;
  // }
  //
  // private String getSymbol(int id)
  // {
  //     return symbolTable.get(id);
  // }
  //
  // private String[] relOps = new String[]{".lt",".gt",".ge",".le",".ne"};


//  static PrintStream out;
//  public static void main(String argv[]) {
//      String encodingName = "UTF-8";
//      Main scanner = null;
//      try {
//      	out = new PrintStream(new FileOutputStream("OkCompile//output.txt"));
//      	System.setOut(out);
//      	out.println("lexer output");
//        out.println("RegEx\tToken\tAttVal\n\n");
//        java.io.FileInputStream stream = new java.io.FileInputStream("OkCompile//Input.txt");
//        java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
//        scanner = new Main(reader);
//        while ( !scanner.zzAtEOF ) scanner.next_token();
//      }
//      catch (java.io.FileNotFoundException e) {
//        System.out.println("File not found : ");
//      }
//      catch (java.io.IOException e) {
//        System.out.println("IO error scanning file");
//        System.out.println(e);
//      }
//      catch (Exception e) {
//        System.out.println("Unexpected exception:");
//        e.printStackTrace();
//      }
//  }
%}
/*
  Macro Declarations

  These declarations are regular expressions that will be used latter
  in the Lexical Rules Section.
*/
LETTER = [a-zA-Z]
DIGIT = [0-9]
NON_ZERO_DIGIT = [1-9]
HASH_KW = "#"
BOOL_KW = "true"|"false"
/* White space is a line terminator, space, tab, or line feed. */
WHITE_SPACE = \r|\n|\r\n| [ \t\f]

LETDIG = {DIGIT}|{LETTER}
ID = {HASH_KW}{LETTER}{LETTER}{DIGIT}{DIGIT}
FAKE_ID = {ID}{LETDIG}+
NUMCONST = {NON_ZERO_DIGIT}{DIGIT}*|"0"
WITHOUT_N = [a-mo-zA-Z]|{NON_ZERO_DIGIT}
CHARCONST = "\\\\"{WITHOUT_N}|"\\"{WITHOUT_N}|"\'"{WITHOUT_N}"\'"//TODO Need coding
COMMENT = "//".*
REALCONST = {NON_ZERO_DIGIT}{DIGIT}*"."{DIGIT}*{NON_ZERO_DIGIT}|{DIGIT}"."{DIGIT}|{NON_ZERO_DIGIT}{DIGIT}+"."{DIGIT}|{DIGIT}"."{DIGIT}*{NON_ZERO_DIGIT}

FAKE_REAL_CONST = "0"{DIGIT}+"."{DIGIT}|"0"{DIGIT}+"."{DIGIT}+"0"|{DIGIT}+"."{DIGIT}+"0"
FAKE_NUM_CONST = "0"{DIGIT}+

OR_KW = "or"
AND_KW = "and"
ELSE_KW = "else"
THEN_KW = "then"
NOT_KW = "not"
IF_KW = "if"
END_KW ="end"
SWITCH_KW = "switch"
CASE_KW = "case"
WHILE_KW = "while"
DEFAULT_KW = "default"
BREAK_KW = "break"
REL_OP_KW = ".le"|".lt"|".gt"|".ge"|".eq"|".ne"
MATH_OP_KW = "+"|"-"|"*"|"/"|"%"
UNARY_MATH_OP_KW ="++"|"--"
MATH_OP_ASSIGN_KW = "+="|"-="|"*="|"/="
UNARY_OP_KW = "-"|"*"|"?"
RETURN_KW = "return"
RECORD_KW = "record"
STATIC_KW = "static"
TYPESPECIFIER_KW = "int"|"real"|"bool"|"char"
FAKE_TYPESPECIFIER_KW = {LETDIG}+{TYPESPECIFIER_KW}|{TYPESPECIFIER_KW}{LETDIG}+|{LETDIG}+{TYPESPECIFIER_KW}{LETDIG}+
// PUNC_KW = "{"|"}"|"["|"]"|","|":"|"("|")"|"."
LEFTAC = "{"
 RIGHTAC = "}"
  LEFTAR = "["
  RIGHTAR = "]"
  COLUMN = ","
  TWO_COLUMN = ":"
  LEFTPA ="("
  RIGHTPA = ")"
  DOT_KW = "."
SEMI_COLUMN_KW = ";"
ASSIGN_KW = "="
OTHER = /*{ASSIGN_KW}|{PUNC_KW}|*/{STATIC_KW}|{RECORD_KW}|{RETURN_KW}/*|{UNARY_OP_KW}|{MATH_OP_KW}|{MATH_OP_ASSIGN_KW}|{UNARY_MATH_OP_KW}|{REL_OP_KW}*/|{RECORD_KW}|{DEFAULT_KW}|{WHILE_KW}|{CASE_KW}|{SWITCH_KW}|{END_KW}|{IF_KW}|{NOT_KW}|{THEN_KW}|{ELSE_KW}|{AND_KW}|{OR_KW}
OTHER_FAKES = {LETDIG}+{OTHER}|{OTHER}{LETDIG}+|{LETDIG}+{OTHER}{LETDIG}+



%%
/* ------------------------Lexical Rules Section---------------------- */

/*
   This section contains regular expressions and actions, i.e. Java
   code, that will be executed when the scanner matches the associated
   regular expression. */

   /* YYINITIAL is the state at which the lexer begins scanning.  So
   these regular expressions will only be matched if the scanner is in
   the start state YYINITIAL. */

<YYINITIAL> {

    {ID}                        {
                                    //int id=addSymbol(yytext());
                                    System.out.println("ID\t"+yytext()+"\t"+yytext());
                                    YYParser.idVal = yytext();
                                    return YYParser.ID_KW;
                                }
    {STATIC_KW}                 {
                                    System.out.println("STATIC_KW\t"+yytext());
                                    return YYParser.STATIC_KW;
                                }
    {RECORD_KW}                 {
                                    System.out.println("RECORD_KW\t"+yytext());
                                    return YYParser.RECORD_KW;
                                }
    {RETURN_KW}                 {
                                    System.out.println("RETURN_KW\t"+yytext());
                                    return YYParser.RETURN_KW;
                                }
    {REALCONST}                 {
                                    System.out.println("REALCONST\t"+yytext());
                                    YYParser.realVal = yytext();
                                    return YYParser.REALCONST;
                                }
    {FAKE_REAL_CONST}           {
                                    System.out.println("illegal Character\t"+yytext());
                                    //return YYParser.FAKE_REAL_CONST;
                                }
    {FAKE_NUM_CONST}            {
                                    System.out.println("illegal Character\t"+yytext());
                                    //return YYParser.FAKE_NUM_CONST;
                                }
    {NUMCONST}                  {
                                    System.out.println("NUMCONST\t"+yytext());
                                    YYParser.intVal = yytext();
                                    return YYParser.NUMCONST;
                                }
    {OR_KW}                     {
                                    System.out.println("OR_KW\t"+yytext());
                                    return YYParser.OR_KW;
                                }
    {AND_KW}                    {
                                    System.out.println("AND_KW\t"+yytext());
                                    return YYParser.AND_KW;
                                }
    {ELSE_KW}                   {
                                    System.out.println("ELSE_KW\t"+yytext());
                                    return YYParser.ELSE_KW;
                                }
    {THEN_KW}                   {
                                    System.out.println("THEN_KW\t"+yytext());
                                    return YYParser.THEN_KW;
                                }
    {NOT_KW}                    {
                                    System.out.println("NOT_KW\t"+yytext());
                                    return YYParser.NOT_KW;
                                }
    {IF_KW}                     {
                                    System.out.println("IF_KW\t"+yytext());
                                    return YYParser.IF_KW;
                                }
    {END_KW}                    {
                                    System.out.println("END_KW\t"+yytext());
                                    return YYParser.END_KW;
                                }
    {SWITCH_KW}                 {
                                    System.out.println("SWITCH_KW\t"+yytext());
                                    return YYParser.SWITCH_KW;
                                }
    {CASE_KW}                   {
                                    System.out.println("CASE_KW\t"+yytext());
                                    return YYParser.CASE_KW;
                                }
    {WHILE_KW}                  {
                                    System.out.println("WHILE_KW\t"+yytext());
                                    return YYParser.WHILE_KW;
                                }
    {DEFAULT_KW}                {
                                    System.out.println("DEFAULT_KW\t"+yytext());
                                    return YYParser.DEFAULT_KW;
                                }
    {BREAK_KW}                  {
                                    System.out.println("BREAK_KW\t"+yytext());
                                    return YYParser.BREAK_KW;
                                }
    {REL_OP_KW}                 {
                                    System.out.println("REL_OP_KW\t"+yytext());
                                    YYParser.relOpVal = yytext();
                                    return YYParser.REL_OP_KW;
                                }
    {MATH_OP_KW}                {
                                    System.out.println("MATH_OP_KW\t"+yytext());
                                    YYParser.mathOpVal = yytext();
                                    return YYParser.MATH_OP_KW;
                                }
    {UNARY_OP_KW}               {
                                    System.out.println("UNARY_OP_KW\t"+yytext());
                                    YYParser.unaryOpVal = yytext();
                                    return YYParser.UNARY_OP_KW;
                                }
    {TYPESPECIFIER_KW}          {
                                    YYParser.typeVal =  yytext();
                                    System.out.println("TYPESPECIFIER_KW\t"+yytext());
                                    return YYParser.TYPESPECIFIER_KW;
                                }
    {COMMENT}                   {
                                    System.out.println("COMMENT\t"+yytext());
                                    //return YYParser.COMMENT;
                                }
    // {PUNC_KW}                   {
    //                                 // out.println("PUNC_KW\t"+yytext());
    //                                 return YYParser.PUNC_KW;
    //                             }
    //%token LEFTAC RIGHTAC LEFTAR RIGHTAR COLUMN TWO_COLUMN LEFTPA RIGHTPA DOT_KW //"{" "}" "[" "]" "," ":" "(" ")" "."

    {LEFTAC}
                                {
                                    return YYParser.LEFTAC;
                                }
    {RIGHTAC}
                                {
                                  return YYParser.RIGHTAC;
                                }
    {LEFTAR}
                                {
                                  return YYParser.LEFTAR;
                                }
    {RIGHTAR}
                                {
                                  return YYParser.RIGHTAR;
                                }
    {COLUMN}
                                {
                                  return YYParser.COLUMN;
                                }

    {TWO_COLUMN}
                                {
                                  return YYParser.TWO_COLUMN;
                                }

    {LEFTPA}
                                {
                                  return YYParser.LEFTPA;
                                }
    {RIGHTPA}
                                    {
                                      return YYParser.RIGHTPA;
                                    }
    {DOT_KW}
                              {
                                return YYParser.DOT_KW;
                              }


                                //PUNC_KW = "{"|"}"|"["|"]"|","|":"|"("|")"|"."

    {ASSIGN_KW}                 {
                                    System.out.println("ASSIGN_KW\t"+yytext());
                                    return YYParser.ASSIGN_KW;
                                }
    {MATH_OP_ASSIGN_KW}         {
                                    System.out.println("MATH_OP_ASSIGN_KW\t"+yytext());
                                    YYParser.mathOpAssignVal = yytext();
                                    return YYParser.MATH_OP_ASSIGN_KW;
                                }
    {UNARY_MATH_OP_KW}          {
                                    System.out.println("UNARY_MATH_OP_KW\t"+yytext());
                                    YYParser.unaryMathOpVal = yytext();
                                    return YYParser.UNARY_MATH_OP_KW;
                                }
    {BOOL_KW} 				          {
                                    System.out.println("BOOL_KW\t"+yytext());
                                    YYParser.boolVal = yytext();
                                    return YYParser.BOOL_KW;
                                }
    {ASSIGN_KW} 			          {
                                    System.out.println("ASSIGN_KW"+yytext());
                                    return YYParser.ASSIGN_KW;
                                }
    {CHARCONST}                 {
                                    System.out.println("CHARCONST\t"+yytext());
                                    YYParser.charVal = yytext();
                                    return YYParser.CHARCONST;
                                }
    {SEMI_COLUMN_KW}            {
                                    return YYParser.SEMI_COLUMN_KW;
                                }
    {FAKE_TYPESPECIFIER_KW}	    {
                                    System.out.println("Illegal character:\t"+yytext());
                                    //return YYParser.FAKE_TYPESPECIFIER_KW;
                                }
    {FAKE_ID}				            {
                                    System.out.println("Illegal character:\t"+yytext());
                                    //return YYParser.FAKE
                                }
    {OTHER_FAKES}			          {
                                    System.out.println("Illegal character:\t"+yytext());
                                }
    // /* Don't do anything if whitespace is found */
    {WHITE_SPACE}               { /* just skip what was found, do nothing */ }
}


/* No token was found for the input so through an error.  Print out an
   Illegal character message with the illegal character that was found. */
[^]                             { System.out.println("Illegal character <"+yytext()+">"); }
