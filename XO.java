import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class StartXO extends JFrame implements ActionListener
{
	Button start=new Button("Start Playing...!");
	Label l=new Label("         Green / Red Game!           ");
  	Button g=new Button("            ");
	Button r=new Button("            ");
JProgressBar p=new JProgressBar(10,20);

	Container con=getContentPane();
	StartXO()
	{
		setBounds(420,150,500,500);
        setLayout(null);
        con.setBackground(new Color(10,100,50));
        l.setFont(new Font("Arabic Typesetting",Font.BOLD,30));
        l.setForeground(new Color(255,255,255));
        l.setBounds(30,130,500,30);
        start.setBounds(40,250,400,40);
        g.setBackground(Color.GREEN);
r.setBackground(Color.RED);
g.setBounds(40,180,200,50);
r.setBounds(240,180,200,50);
        p.setBounds(40,300,400,20);

        add(l);
        add(g);
        add(r);
        add(start);
        add(p);

        start.setFont(new Font("Arabic Typesetting",Font.BOLD,22));

        start.addActionListener(this);
	 g.addActionListener(this);
	 r.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o==start)
		{
p.setValue(50);
p.setStringPainted(true);
p.setForeground(new Color(10,50,10));
JOptionPane.showMessageDialog(null,"Welcome");
		GameXO x=new GameXO();
		x.setVisible(true);
		setVisible(false);
     	}
else if (o==g)
{
con.setBackground(Color.GREEN);
}
else if (o==r)
con.setBackground(Color.RED);


	}
}





class GameXO extends JFrame implements ActionListener
{
Button b1=new Button("");
Button b2=new Button("");
Button b3=new Button("");
Button b4=new Button("");
Button b5=new Button("");
Button b6=new Button("");
Button b7=new Button("");
Button b8=new Button("");
Button b9=new Button("");

GameXO()
{
super("X-O Game!");
setBounds(200,20,800,700);
setLayout(new GridLayout(3,3,5,5));
setResizable(false);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Object o=e.getSource();

if(o==b1)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b1.setBackground(Color.GREEN);
	else
	b1.setBackground(Color.RED);
b1.setEnabled(false);
	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
{
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);

}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }

}
if(o==b2)
{
String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b2.setBackground(Color.GREEN);
	else
	b2.setBackground(Color.RED);
b2.setEnabled(false);

	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
{
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b3)
{
String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b3.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b3.setBackground(Color.RED);
	b3.setEnabled(false);

	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
{
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b4)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b4.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b4.setBackground(Color.RED);
b4.setEnabled(false);

		if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b5)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b5.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b5.setBackground(Color.RED);
  b5.setEnabled(false);

  if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
  else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
        {
        JOptionPane.showMessageDialog(null,"Player 1 win!");
        setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b6)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
		if(x.equals("g"))
		b6.setBackground(Color.GREEN);
		else if(x.equals("r"))
		b6.setBackground(Color.RED);
	b6.setEnabled(false);

	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
     {
     JOptionPane.showMessageDialog(null,"Player 1 win!");
    setVisible(false);
}
 else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b7)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b7.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b7.setBackground(Color.RED);
b7.setEnabled(false);

		if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
  else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
        {
        JOptionPane.showMessageDialog(null,"Player 1 win!");
        setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b8)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b8.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b8.setBackground(Color.RED);
b8.setEnabled(false);

	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
    {
    JOptionPane.showMessageDialog(null,"Player 1 win!");
setVisible(false);
}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 1 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 1 win!");
  	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }


}
if(o==b9)
{
	String x=JOptionPane.showInputDialog(null,"g or r");
	if(x.equals("g"))
	b9.setBackground(Color.GREEN);
	else if(x.equals("r"))
	b9.setBackground(Color.RED);
	b9.setEnabled(false);

	if(b1.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
     {
     JOptionPane.showMessageDialog(null,"Player 1 win!");
setVisible(false);
}
else if(b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN||b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN)
      {
      JOptionPane.showMessageDialog(null,"Player 1 win!");
      setVisible(false);
  }
  else if(b3.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
        {
        JOptionPane.showMessageDialog(null,"Player 1 win!");
        setVisible(false);
  }
  else if(b4.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
          {
          JOptionPane.showMessageDialog(null,"Player 1 win!");
          setVisible(false);
  }
  else if(b5.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN||b5.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
  }
   else if(b6.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b6.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
            {
            JOptionPane.showMessageDialog(null,"Player 1 win!");
            setVisible(false);
  }
   else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }

   else if(b8.getBackground()==Color.GREEN&&b2.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN)
              {
              JOptionPane.showMessageDialog(null,"Player 1 win!");
              setVisible(false);
    }
   else if(b9.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b6.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN||b9.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b7.getBackground()==Color.GREEN)
	              {
	              JOptionPane.showMessageDialog(null,"Player 1 win!");
	              setVisible(false);
    }
else if (b1.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b1.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
   {
	           JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);

   }
 else if(b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b3.getBackground()==Color.RED||b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b8.getBackground()==Color.RED)
      {
      JOptionPane.showMessageDialog(null,"Player 2 win!");
      setVisible(false);
  }
   else if(b3.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b1.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b3.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
          {
          JOptionPane.showMessageDialog(null,"Player 2 win!");
          setVisible(false);
    }
    else if(b4.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
            {
            JOptionPane.showMessageDialog(null,"Player 2 win!");
            setVisible(false);
    }
    else if(b5.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b8.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b7.getBackground()==Color.RED||b5.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b6.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b6.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b9.getBackground()==Color.RED||b6.getBackground()==Color.RED&&b4.getBackground()==Color.RED&&b5.getBackground()==Color.RED)
              {
              JOptionPane.showMessageDialog(null,"Player 2 win!");
              setVisible(false);
    }
     else if(b7.getBackground()==Color.GREEN&&b1.getBackground()==Color.GREEN&&b4.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b8.getBackground()==Color.GREEN&&b9.getBackground()==Color.GREEN||b7.getBackground()==Color.GREEN&&b3.getBackground()==Color.GREEN&&b5.getBackground()==Color.GREEN)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }

     else if(b8.getBackground()==Color.RED&&b2.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED&&b9.getBackground()==Color.RED)
                {
                JOptionPane.showMessageDialog(null,"Player 2 win!");
                setVisible(false);
      }
     else if(b9.getBackground()==Color.RED&&b3.getBackground()==Color.RED&&b6.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b1.getBackground()==Color.RED&&b5.getBackground()==Color.RED||b9.getBackground()==Color.RED&&b8.getBackground()==Color.RED&&b7.getBackground()==Color.RED)
  	              {
  	              JOptionPane.showMessageDialog(null,"Player 2 win!");
  	              setVisible(false);
    }






}
}

}
