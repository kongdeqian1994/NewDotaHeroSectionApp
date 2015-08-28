import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
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
	JLabel welcomeword = new JLabel("Welcome to HeroSelection V1.1");
	HeroBuffer Main_buffer = new HeroBuffer();
	public HeroUI(){
		
		
		Main_buffer.addAllHero();
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
		Leftpanel.setLayout(new GridLayout(10,2));
		JLabel HeroType = new JLabel("Hero Type");
		HeroType.setFont(new Font("Times New Rome", Font.BOLD, 20));
		Leftpanel.add(HeroType);
		JLabel Empty = new JLabel(" ");
		Leftpanel.add(Empty);

		
		JButton StrengthHero = new JButton("STRENGTH HERO");
		StrengthHero.setForeground(Color.RED);
		StrengthHero.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(StrengthHero);
		ImageIcon  Strength = new ImageIcon("picture/Strength.jpg");
		JLabel Strength_picture = new JLabel(Strength);
		Leftpanel.add(Strength_picture);
		
		
		JButton AGILITY_HERO = new JButton("AGILITY HERO");
		AGILITY_HERO.setBorder(BorderFactory.createRaisedBevelBorder());
		AGILITY_HERO.setForeground(Color.GREEN);
		Leftpanel.add(AGILITY_HERO);
		ImageIcon  Agility = new ImageIcon("picture/Agility.jpg");
		JLabel Agility_picture = new JLabel(Agility);
		Leftpanel.add(Agility_picture);
		
		
		JButton INTELLIGENCE_HERO = new JButton("INTELLIGENCE HERO");
		INTELLIGENCE_HERO.setForeground(Color.BLUE);
		INTELLIGENCE_HERO.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(INTELLIGENCE_HERO);
		ImageIcon  Intelligence = new ImageIcon("picture/Intelligence.jpg");
		JLabel Intelligence_picture = new JLabel(Intelligence);
		Leftpanel.add(Intelligence_picture);
		
		
		JLabel HeroAility = new JLabel("Hero Ability");
		HeroAility.setFont(new Font("Times New Rome", Font.BOLD, 20));
		Leftpanel.add(HeroAility);
		JLabel Empty1 = new JLabel(" ");
		Leftpanel.add(Empty1);
		
		JButton Push_Button = new JButton("Push");
		Push_Button.setForeground(Color.BLUE);
		Push_Button.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(Push_Button);
		ImageIcon  Push_Picture = new ImageIcon("picture/Push.jpg");
		JLabel Push_Label = new JLabel(Push_Picture);
		Leftpanel.add(Push_Label);
		
		
		JButton AOE_Button = new JButton("AOE");
		AOE_Button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Main_buffer = Main_buffer.find_AOE_Hero();
			}

		});
		AOE_Button.setForeground(Color.BLUE);
		AOE_Button.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(AOE_Button);
		ImageIcon  AOE_Picture = new ImageIcon("picture/AOE.jpg");
		JLabel AOE_Label = new JLabel(AOE_Picture);
		Leftpanel.add(AOE_Label);
		
		
		JButton Stun_Button = new JButton("Stun");
		Stun_Button.setForeground(Color.BLUE);
		Stun_Button.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(Stun_Button);
		ImageIcon  Stun_Picture = new ImageIcon("picture/Stun.jpg");
		JLabel Stun_Label = new JLabel(Stun_Picture);
		Leftpanel.add(Stun_Label);
		
		
		JButton Escape_Button = new JButton("Escape");
		Escape_Button.setForeground(Color.BLUE);
		Escape_Button.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(Escape_Button);
		ImageIcon  Escape_Picture = new ImageIcon("picture/Escape.jpg");
		JLabel Escape_Label = new JLabel(Escape_Picture);
		Leftpanel.add(Escape_Label);
		
		JButton SlowDown_Button = new JButton("SlowDown");
		SlowDown_Button.setForeground(Color.BLUE);
		SlowDown_Button.setBorder(BorderFactory.createRaisedBevelBorder());
		Leftpanel.add(SlowDown_Button);
		ImageIcon  SlowDown_Picture = new ImageIcon("picture/SlowDown.jpg");
		JLabel SlowDown_Label = new JLabel(SlowDown_Picture);
		Leftpanel.add(SlowDown_Label);
		
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
