package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{  public String ope="";
        public double var1=0,var2=0,var3=0;
        String s,s1;

        private Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10, clear_all;
        private Button set_div, set_mul,set_minus,set_plus,set_mod, equal_to, backspace,dot,plusorminus;
        private EditText editText;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.button);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);
            button4=findViewById(R.id.button4);
            button5=findViewById(R.id.button5);
            button6=findViewById(R.id.button6);
            button7=findViewById(R.id.button7);
            button8=findViewById(R.id.button8);
            button9=findViewById(R.id.button9);
            button10=findViewById(R.id.button10);
            set_div =findViewById(R.id.set_div);
            set_mul =findViewById(R.id.set_mul);
            set_minus=findViewById(R.id.set_minus);
            set_plus=findViewById(R.id.set_plus);
            set_mod=findViewById(R.id.set_mod);
            clear_all =findViewById(R.id.clear_all);
            equal_to =findViewById(R.id.equal_to);
            backspace =findViewById(R.id.backspace);
            dot=findViewById(R.id.dot);
            plusorminus=findViewById(R.id.plusorminus);
            editText =findViewById(R.id.editTextTextPersonName);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    s=editText.getText().toString();
                    if(s.isEmpty())
                    {
                        editText.setText("1");
                    }
                    else
                    {
                        s=(s+"1");
                        editText.setText(s);
                    }

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("2");
                    }
                    else {
                        s = (s + "2");
                        editText.setText(s);
                    }

                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("3");
                    }
                    else {
                        s = (s + "3");
                        editText.setText(s);
                    }

                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("4");
                    }
                    else {
                        s = (s + "4");
                        editText.setText(s);
                    }

                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("5");
                    }
                    else {
                        s = (s + "5");
                        editText.setText(s);
                    }

                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("6");
                    }
                    else {
                        s = (s + "6");
                        editText.setText(s);
                    }

                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("7");
                    }
                    else {
                        s = (s + "7");
                        editText.setText(s);
                    }

                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("8");
                    }
                    else {
                        s = (s + "8");
                        editText.setText(s);
                    }

                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("9");
                    }
                    else {
                        s = (s + "9");
                        editText.setText(s);
                    }

                }
            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("0");
                    }
                    else {
                        s = (s + "0");
                        editText.setText(s);
                    }

                }
            });

            dot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s=editText.getText().toString();
                    if(s.equals("0"))
                    {
                        editText.setText("0");
                    }
                    else {
                        s = (s + ".");
                        editText.setText(s);
                    }
                }
            });
            clear_all.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    editText.setHint(""+0);
                    editText.setText("");
                    var1=0;
                    var2=0;
                    ope="";
                }
            });
            set_div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0") ||editText.getText().toString().isEmpty())
                    {

                    }
                    else
                    {
                        ope = "/";
                        var1=Float.parseFloat(editText.getText().toString());
                        String s = editText.getText().toString();
                        editText.setText(s+"/");
                    }


                }
            });
            set_mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0") ||editText.getText().toString().isEmpty())
                    {

                    }
                    else
                    {
                        ope = "*";
                        var1=Float.parseFloat(editText.getText().toString());
                        String s = editText.getText().toString();
                        editText.setText(s+"*");
                    }


                }
            });
            set_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0") || editText.getText().toString().isEmpty())
                    {
                        String s=editText.getText().toString();
                    }
                    else {
                        ope = "-";
                        String s = editText.getText().toString();
                        var1 = Float.parseFloat(s);
                        editText.setText(s+"-");
                    }
                }
            });
            set_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0") ||editText.getText().toString().isEmpty())
                    {

                    }
                    else
                    {
                        ope = "+";
                        var1=Float.parseFloat(editText.getText().toString());
                        String s = editText.getText().toString();
                        editText.setText(s+"+");
                    }


                }
            });
            set_mod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0") ||editText.getText().toString().isEmpty())
                    {

                    }
                    else
                    {
                        ope = "%";
                        var1=Float.parseFloat(editText.getText().toString());
                        String s = editText.getText().toString();
                        editText.setText(s+"%");
                    }

                }
            });
            equal_to.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editText.getText().toString().equals("0")||editText.getText().toString().isEmpty())
                    {

                    }
                    else
                    {
                        if(editText.getText().toString().contains("+"))
                        {
                            int i=editText.getText().toString().indexOf("+");
                            var2=Float.parseFloat(editText.getText().toString().substring(i+1));
                        }
                        else if(editText.getText().toString().contains("-"))
                        {
                            int i=editText.getText().toString().indexOf("-");
                            var2=Float.parseFloat(editText.getText().toString().substring(i+1));
                        }
                        else if(editText.getText().toString().contains("*"))
                        {
                            int i=editText.getText().toString().indexOf("*");
                            var2=Float.parseFloat(editText.getText().toString().substring(i+1));
                        }
                        else if(editText.getText().toString().contains("/"))
                        {
                            int i=editText.getText().toString().indexOf("/");
                            var2=Float.parseFloat(editText.getText().toString().substring(i+1));
                        }
                        else if(editText.getText().toString().contains("%"))
                        {
                            int i=editText.getText().toString().indexOf("%");
                            var2=Float.parseFloat(editText.getText().toString().substring(i+1));
                        }

                        switch(ope)
                        {
                            case "+":
                                if((var1+var2)%1==0)
                                {
                                    int res= (int) (var1+var2);
                                    editText.setText(""+res);
                                }
                                else
                                    editText.setText(""+(var1+var2));

                                break;
                            case "-":
                                if((var1-var2)%1==0)
                                {
                                    int res= (int) (var1-var2);
                                    editText.setText(""+res);
                                }
                                else
                                    editText.setText(""+(var1-var2));
                                break;
                            case "*":
                                if((var1*var2)%1==0)
                                {
                                    int res= (int) (var1*var2);
                                    editText.setText(""+res);
                                }
                                else
                                    editText.setText(""+(var1*var2));
                                break;
                            case "/":
                                if((var1/var2)%1==0)
                                {
                                    int res= (int) (var1/var2);
                                    editText.setText(""+res);
                                }
                                else
                                    editText.setText(""+(var1/var2));
                                break;
                            case "%":
                                if((var1%var2)%1==0)
                                {
                                    int res= (int) (var1%var2);
                                    editText.setText(""+res);
                                }
                                else
                                    editText.setText(""+(var1%var2));
                                break;
                        }

                    }
                    }

            });
            backspace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (editText.getText().toString().isEmpty()) {

                    } else {
                        String s = editText.getText().toString();
                        int a = Integer.parseInt(s);
                        a = a / 10;
                        if(a<=0)
                        {
                            editText.setText("");
                        }
                        else
                        {
                            editText.setText("" + a);
                        }

                    }
                }
            });

            plusorminus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Float.parseFloat(editText.getText().toString())%1==0)
                    {
                        int num=Integer.parseInt(editText.getText().toString());
                        if(num<0)
                        {
                            num=num-num-num;
                        }
                        else
                        {
                            num=num-num-num;
                        }
                        String s=""+num;
                        editText.setText(s);
                    }
                    else
                    {
                        float num=Float.parseFloat(editText.getText().toString());
                        if(num<0)
                        {
                            num=num-num-num;
                        }
                        else
                        {
                            num=num-num-num;
                        }
                        String s=""+num;
                        editText.setText(s);
                    }
                }

            });

        }
}