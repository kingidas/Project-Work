/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservicesapp;

/**
 *
 * @author Leon Daly x12112381
 *
 *
 */
/*
 *
 * @reference= In class maths Example . and just added two more sections of
 *             of my own .
 *
 */
public class maths {

    private int num1;
    private int num2;
    private int ans;

    public maths() {
        num1 = 0;
        num2 = 0;
        ans = 0;

    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void add() {
        ans = num1 + num2;

    }

    public void multiply() {
        ans = num1 * num2;
    }

    public void Divide() {
        ans = num1 / num2;
    }

    public void Subtract() {
        ans = num1 - num2;
    }
}
