package com.san.datastructure.栈和队列;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/21/20:57
 * 表达式求值
 */
public class Expression {

    private String expr;

    public Expression(String expr){
        this.expr = expr;
    }

    /**
     * 表达式求值
     * @return
     */
    public int compute(){
        //运算数栈
        char[] OPND = new char[10];
        //运算符栈
        char[] OPTR = new char[10];
        //初始化边界符
        OPTR[0] = '#';
        int top1 = -1;
        int top2 = 0;
        char[] chars = expr.toCharArray();
        for (int i=0;i<chars.length;){
            int grade,num1,num2,oper,result = 0;
            //将数字转化为字符压栈
            if (chars[i]>=48 && chars[i]<=57){
                OPND[++top1] = (char) (chars[i++]-48);
            }else {
                //比较当前与栈顶运算符优先级
                grade = comp(chars[i],OPTR[top2]);
                //优先级高
                if (grade==1){
                    //运算符入栈
                    OPTR[++top2] = chars[i++];
                    //运算符较低
                }else if (grade==-1){
                    //运算数出栈
                    num2 = OPND[top1--];
                    num1 = OPND[top1--];
                    //运算符出栈
                    oper = OPTR[top2--];
                    switch (oper){
                        case '+':
                            result = num1+num2;
                            break;
                        case '-':
                            result = num1-num2;
                            break;
                        case '*':
                            result = num1*num2;
                            break;
                        case '/':
                            result = num1/num2;
                            break;
                        default:
                            break;
                    }
                    //运算结果入栈
                    OPND[++top1] = (char) result;
                    //当前与栈顶优先级相同，扫描下一个字符
                }else {
                    top2--;
                    i++;
                }
            }
        }
        //返回栈顶结果
        return OPND[top1];
    }
    /**
     * 比骄运算符优先级
     * @param oper1
     * @param oper2
     * @return
     * 1:oper1 优先级高
     * 0：优先级相同
     * -1：oper1低
     */
    private int comp(char oper1,char oper2){
        switch (oper1){
            case '+': case '-': if (oper2=='('||oper2=='#') return 1;else return -1;
            case '*': case '/': if (oper2=='*'||oper2=='/') return -1;else return 1;
            case '(':return 1;
            case ')':if (oper2=='(') return 0;else return -1;
            case '#':if (oper2=='#') return 0; else return -1;
            default:break;
        }
        return 0;
    }


    public static void main(String[] args) {
        Expression expression = new Expression("(4+2)*3-5#");
        int result = expression.compute();
        System.out.println("运算结果为："+result);
    }
}
