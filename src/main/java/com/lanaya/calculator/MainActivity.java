package com.lanaya.calculator;

//import android.icu.text.DecimalFormat;
import java.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import static android.R.attr.format;

public class MainActivity extends AppCompatActivity {
    String accu="";
    double tmpOp=0,rst,mem=0;
    int operation;
//    NumberFormat f = new DecimalFormat();
    DecimalFormat f= new DecimalFormat();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MemChecker();

    }
    public void MemChecker(){
        if(mem==0) {
            Button btn0 = (Button) findViewById(R.id.btnMemR);
            btn0.setEnabled(false);
            Button btn1 = (Button) findViewById(R.id.btnMemC);
            btn1.setEnabled(false);
        }else{
            Button btn0 = (Button)findViewById(R.id.btnMemR);
            btn0.setEnabled(true);
            Button btn1 = (Button)findViewById(R.id.btnMemC);
            btn1.setEnabled(true);

        }
    }

    public void onClickbtn0(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="0";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn1(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="1";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn2(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="2";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn3(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="3";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn4(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="4";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn5(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="5";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn6(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="6";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn7(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="7";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn8(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="8";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtn9(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+="9";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }
    public void onClickbtnDot(View v){
        ((TextView)findViewById(R.id.screen)).setText("");
        accu+=".";
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }

    //Operation for equal button
    public void onClickbtnEqual(View v){
        if(accu=="")
            return;
        double equalbutton=Double.parseDouble(accu);
        switch (operation) {
            case 1:
                rst = tmpOp + equalbutton;
                ((TextView) findViewById(R.id.screen)).setText(f.format(rst)+"");     //string hunai parne
                ((TextView) findViewById(R.id.screen1)).setText("");
                accu = "";
                break;
            case 2:
                rst = tmpOp - equalbutton;
                ((TextView) findViewById(R.id.screen)).setText(f.format(rst));         //f.format ma chai na parne re
                ((TextView) findViewById(R.id.screen1)).setText("");
                accu = "";
                break;
            case 3:
                rst = tmpOp * equalbutton;
                ((TextView) findViewById(R.id.screen)).setText(f.format(rst)+"");
                ((TextView) findViewById(R.id.screen1)).setText("");
                accu = "";
                break;
            case 4:
                rst = tmpOp / equalbutton;
                ((TextView) findViewById(R.id.screen)).setText(f.format(rst)+"");
                ((TextView) findViewById(R.id.screen1)).setText("");
                accu = "";
                break;
        }
        tmpOp=rst;
        operation=0;
    }

    public void onClickbtnAdd(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        ((TextView)findViewById(R.id.screen1)).setText(f.format(tmpOp)+"+");
        operation=1;
        accu="";
    }
    public void onClickbtnSub(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        ((TextView)findViewById(R.id.screen1)).setText(f.format(tmpOp)+"-");
        operation=2;
        accu="";
    }
    public void onClickbtnMul(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        ((TextView)findViewById(R.id.screen1)).setText(f.format(tmpOp)+"*");
        operation=3;
        accu="";
    }
    public void onClickbtnDiv(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        ((TextView)findViewById(R.id.screen1)).setText(f.format(tmpOp)+"/");
        operation=4;
        accu="";
    }
    public void onClickbtnClear(View v){
        accu="";
        ((TextView)findViewById(R.id.screen)).setText("");
    }
    public void onClickbtnHardClear(View v){
        accu="";
        ((TextView)findViewById(R.id.screen)).setText("");
        ((TextView)findViewById(R.id.screen1)).setText("");
        tmpOp=0;
    }
    public void onClickbbtnDel(View v){
        if(accu=="")
            return;
        accu=accu.substring(0,accu.length()-1);
        ((TextView)findViewById(R.id.screen)).setText(accu);
    }

    //equal button thichna na parne haru
    public void onClickbtnSqrRoot(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        rst=Math.sqrt(tmpOp);
        ((TextView) findViewById(R.id.screen)).setText(Double.toString(rst));
        accu="";
        tmpOp=rst;
    }
    public void onClickbtnSquare(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        rst=tmpOp*tmpOp;
        ((TextView) findViewById(R.id.screen)).setText(Double.toString(rst));
        accu="";
        tmpOp=rst;
    }
    public void onClickbtnExpo(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        if(tmpOp==0)
            return;
        rst=Math.pow(10,tmpOp);
        ((TextView) findViewById(R.id.screen)).setText(Double.toString(rst));
        accu="";
        tmpOp=rst;
    }
    public void onClickbtnPlusMinus(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        rst=-tmpOp;
        ((TextView) findViewById(R.id.screen)).setText(Double.toString(rst));
        accu="";
        tmpOp=rst;
    }
    public void onClickbtnDivideByOne(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        if(tmpOp==0)
            return;
        rst=1/tmpOp;
        ((TextView) findViewById(R.id.screen)).setText(Double.toString(rst));
        accu="";
        tmpOp=rst;
    }

    //memory operation

    public void onClickbtnMemP(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        mem+=tmpOp;
        accu="";
        if(tmpOp!=0)
            ((TextView)findViewById(R.id.screen1)).setText("Added to Memory");
        MemChecker();
    }
    public void onClickbtnMemS(View v){
        if(accu!="")
            tmpOp=Double.parseDouble(accu);
        mem-=tmpOp;
        accu="";
        if(tmpOp!=0)
            ((TextView)findViewById(R.id.screen1)).setText("Subtracted from Memory");
        MemChecker();
    }
    public void onClickbtnMemR(View v){
        ((TextView)findViewById(R.id.screen)).setText(Double.toString(mem));
        accu=Double.toString(mem);
        ((TextView)findViewById(R.id.screen1)).setText("Memory");
        MemChecker();
    }
    public void onClickbtnMemC(View v){
        if (tmpOp != 0 && mem!=0)
            ((TextView)findViewById(R.id.screen1)).setText("Memory Cleared");
        mem=0;
        accu="";
        MemChecker();
    }



}
