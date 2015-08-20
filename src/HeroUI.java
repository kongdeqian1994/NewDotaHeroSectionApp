import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class HeroUI {
	JFrame MainUI = new JFrame("HeroSelection");
	JPanel Downpanel = new JPanel();
	JPanel Rightpanel = new JPanel();
	JPanel Midpanel = new JPanel();
	JLabel welcomeword = new JLabel("Welcome to HeroSelection V1.0");
	public HeroUI(){
		MainUI.setSize(100, 600);
		MainUI.setLocationRelativeTo(null);
		MainUI.setVisible(true);
		MainUI.setLayout(new BorderLayout());
		MainUI.setResizable(false);
		
		// That is the end of Left panel
		
		
		JPanel Uppanel = MakeUppanel();
		JPanel Leftpanel = MakeLeftpanel();
		MainUI.add(Uppanel, BorderLayout.NORTH);
		MainUI.add(Downpanel, BorderLayout.SOUTH);
		MainUI.add(Midpanel, BorderLayout.CENTER);
		MainUI.add(Leftpanel, BorderLayout.WEST);
		MainUI.add(Rightpanel, BorderLayout.EAST);
		MainUI.pack();
		//That is the end of MainUI part
		
		
		
	
	}
	//that is the method to make Uppanel
	private JPanel MakeUppanel(){
		JPanel Uppanel = new JPanel();
		Uppanel.setLayout(new FlowLayout());
		Uppanel.setSize(800,100);
		welcomeword.setHorizontalTextPosition(JLabel.LEFT);
		welcomeword.setFont(new Font("Dialog", Font.BOLD, 30));
		ImageIcon  dota2picture = new ImageIcon("picture/Dota2_picture.jpg");
		JLabel dota2_picture = new JLabel(dota2picture);
		dota2_picture.setSize(70,70);
		Uppanel.add(dota2_picture);
		Uppanel.add(welcomeword);
		Uppanel.add(new JButton("Start"));
		Uppanel.add(new JButton("Reset"));
		Uppanel.add(new JButton("Rechoose"));
		return Uppanel;
	}
	//that is the method to make leftpanel
	private JPanel MakeLeftpanel()
	{
		JPanel Leftpanel = new JPanel();
		Leftpanel.setLayout(new GridLayout(4,2));
		JLabel HeroType = new JLabel("Hero Type");
		HeroType.setFont(new Font("Times New Rome", Font.BOLD, 20));
		Leftpanel.add(HeroType);
		JLabel Empty = new JLabel(" ");
		Leftpanel.add(Empty);
		
		JCheckBox StrengthHero = new JCheckBox("STRENGTH HERO");
		StrengthHero.setForeground(Color.RED);
		Leftpanel.add(StrengthHero);
		ImageIcon  Strength = new ImageIcon("picture/Strength.jpg");
		JLabel Strength_picture = new JLabel(Strength);
		Leftpanel.add(Strength_picture);
		
		JCheckBox AGILITY_HERO = new JCheckBox("AGILITY HERO");
		AGILITY_HERO.setForeground(Color.GREEN);
		Leftpanel.add(AGILITY_HERO);
		ImageIcon  Agility = new ImageIcon("picture/Agility.jpg");
		JLabel Agility_picture = new JLabel(Agility);
		Leftpanel.add(Agility_picture);
		
		JCheckBox INTELLIGENCE_HERO = new JCheckBox("INTELLIGENCE HERO");
		INTELLIGENCE_HERO.setForeground(Color.BLUE);
		Leftpanel.add(INTELLIGENCE_HERO);
		Leftpanel.add(INTELLIGENCE_HERO);
		ImageIcon  Intelligence = new ImageIcon("picture/Intelligence.jpg");
		JLabel Intelligence_picture = new JLabel(Intelligence);
		Leftpanel.add(Intelligence_picture);
		return Leftpanel;
	}
	private JPanel MakeRightpanel()
	{
		return Rightpanel;
	}
	private JPanel MakeMidpanel()
	{
		return Midpanel;
	}
	private JPanel MakeDownpanel()
	{
		return Downpanel;
	}
	public static void main(String args[]){
		HeroUI myUI = new HeroUI();
	
	}

}
