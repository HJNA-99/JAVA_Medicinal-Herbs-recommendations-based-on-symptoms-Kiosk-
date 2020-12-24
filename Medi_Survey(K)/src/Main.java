import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main extends JFrame{
	//button
	JButton bes = new JButton("<html><body><center>시작하기</center></body></html>");
	JButton be1y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be1n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be2y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be2n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be3y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be3n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be4y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be4n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be5y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be5n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be6y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be6n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be7y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be7n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be8y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be8n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be9y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be9n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be10y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be10n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be11y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be11n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be12y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be12n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be13y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be13n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be14y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be14n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be15y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be15n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be16y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be16n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be17y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be17n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be18y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be18n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be19y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be19n = new JButton("<html><body><center>아니다</center></body></html>");
	JButton be20y = new JButton("<html><body><center>그렇다</center></body></html>");
	JButton be20n = new JButton("<html><body><center>아니다</center></body></html>");
	
	JButton restart1 = new JButton("<html><body><center>다시하기</center></body></html>");
	JButton restart2 = new JButton("<html><body><center>다시하기</center></body></html>");
	JButton restart3 = new JButton("<html><body><center>다시하기</center></body></html>");
	JButton restart4 = new JButton("<html><body><center>다시하기</center></body></html>");
	//text
	JLabel mainpagetext1 = new JLabel("<html><body><center>메디케어</center></body></html>", SwingConstants.CENTER);
	JLabel mainpagetext2 = new JLabel("<html><body><center>나에게<br>좋은<br>한약재</center></body></html>", SwingConstants.CENTER);
	JLabel q1pagetext1 = new JLabel("1");
	JLabel q1pagetext2 = new JLabel("<html><body>자주&nbsp어지럽고<br>멍한&nbsp느낌이든다</body></html>");
	JLabel q1pagetext3 = new JLabel("( 1/20 )");
	JLabel q2pagetext1 = new JLabel("2");
	JLabel q2pagetext2 = new JLabel("<html><body>식사&nbsp여부와&nbsp상관없이<br>속이&nbsp불편하다</body></html>");
	JLabel q2pagetext3 = new JLabel("( 2/20 )");
	JLabel q3pagetext1 = new JLabel("3");
	JLabel q3pagetext2 = new JLabel("<html><body>목과&nbsp어꺠가&nbsp뻐근하고<br>동작이&nbsp불편하다</body></html>");
	JLabel q3pagetext3 = new JLabel("( 3/20 )");
	JLabel q4pagetext1 = new JLabel("4");
	JLabel q4pagetext2 = new JLabel("<html><body>피로를&nbsp쉽게&nbsp느낀다<br>&nbsp</body></html>");
	JLabel q4pagetext3 = new JLabel("( 4/20 )");
	JLabel q5pagetext1 = new JLabel("5");
	JLabel q5pagetext2 = new JLabel("<html><body>추위를&nbsp잘&nbsp타는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q5pagetext3 = new JLabel("( 5/20 )");
	JLabel q6pagetext1 = new JLabel("6");
	JLabel q6pagetext2 = new JLabel("<html><body>땀이&nbsp많은&nbsp편이다<br>&nbsp</body></html>");
	JLabel q6pagetext3 = new JLabel("( 6/20 )");
	JLabel q7pagetext1 = new JLabel("7");
	JLabel q7pagetext2 = new JLabel("<html><body>갈증을&nbsp자주&nbsp느낀다<br>&nbsp</body></html>");
	JLabel q7pagetext3 = new JLabel("( 7/20 )");
	JLabel q8pagetext1 = new JLabel("8");
	JLabel q8pagetext2 = new JLabel("<html><body>식사&nbsp후&nbsp속이&nbsp불편하다<br>&nbsp</body></html>");
	JLabel q8pagetext3 = new JLabel("( 8/20 )");
	JLabel q9pagetext1 = new JLabel("9");
	JLabel q9pagetext2 = new JLabel("<html><body>더위를&nbsp잘&nbsp타는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q9pagetext3 = new JLabel("( 9/20 )");
	JLabel q10pagetext1 = new JLabel("10");
	JLabel q10pagetext2 = new JLabel("<html><body>더위를&nbsp타면<br>식욕이&nbsp없는&nbsp편이다</body></html>");
	JLabel q10pagetext3 = new JLabel("( 10/20 )");
	JLabel q11pagetext1 = new JLabel("11");
	JLabel q11pagetext2 = new JLabel("<html><body>잘&nbsp놀라는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q11pagetext3 = new JLabel("( 11/20 )");
	JLabel q12pagetext1 = new JLabel("12");
	JLabel q12pagetext2 = new JLabel("<html><body>손이&nbsp차가운&nbsp편이다<br>&nbsp</body></html>");
	JLabel q12pagetext3 = new JLabel("( 12/20 )");
	JLabel q13pagetext1 = new JLabel("13");
	JLabel q13pagetext2 = new JLabel("<html><body>피부가&nbsp붉은&nbsp느낌이&nbsp있다<br>&nbsp</body></html>");
	JLabel q13pagetext3 = new JLabel("( 13/20 )");
	JLabel q14pagetext1 = new JLabel("14");
	JLabel q14pagetext2 = new JLabel("<html><body>배가&nbsp자주&nbsp아프다<br>&nbsp</body></html>");
	JLabel q14pagetext3 = new JLabel("( 14/20 )");
	JLabel q15pagetext1 = new JLabel("15");
	JLabel q15pagetext2 = new JLabel("<html><body>소변을&nbsp자주&nbsp보는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q15pagetext3 = new JLabel("( 15/20 )");
	JLabel q16pagetext1 = new JLabel("16");
	JLabel q16pagetext2 = new JLabel("<html><body>입&nbsp냄새가&nbsp나는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q16pagetext3 = new JLabel("( 16/20 )");
	JLabel q17pagetext1 = new JLabel("17");
	JLabel q17pagetext2 = new JLabel("<html><body>자주&nbsp구역질이&nbsp나고<br>구토하고&nbsp싶다</body></html>");
	JLabel q17pagetext3 = new JLabel("( 17/20 )");
	JLabel q18pagetext1 = new JLabel("18");
	JLabel q18pagetext2 = new JLabel("<html><body>대변을&nbsp자주&nbsp보는&nbsp편이다<br>&nbsp</body></html>");
	JLabel q18pagetext3 = new JLabel("( 18/20 )");
	JLabel q19pagetext1 = new JLabel("19");
	JLabel q19pagetext2 = new JLabel("<html><body>추위를&nbsp타면<br>식욕이&nbsp없는&nbsp편이다</body></html>");
	JLabel q19pagetext3 = new JLabel("( 19/20 )");
	JLabel q20pagetext1 = new JLabel("20");
	JLabel q20pagetext2 = new JLabel("<html><body>음식을&nbsp조금&nbsp밖에<br>먹지&nbsp못한다</body></html>");
	JLabel q20pagetext3 = new JLabel("( 20/20 )");
	JLabel result1text1 = new JLabel("<html><body><center>나에게는</center></body></html>");
	JLabel result1text2 = new JLabel("<html><body><center>감초</center></body></html>");
	JLabel result1text3 = new JLabel("<html><body><center>백출</center></body></html>");
	JLabel result1text4 = new JLabel("<html><body><center>복령</center></body></html>");
	JLabel result1text5 = new JLabel("<html><body><center>한약재가<br>좋습니다</center></body></html>");
	JLabel result2text1 = new JLabel("<html><body><center>나에게는</center></body></html>");
	JLabel result2text2 = new JLabel("<html><body><center>맥문동</center></body></html>");
	JLabel result2text3 = new JLabel("<html><body><center>오미자</center></body></html>");
	JLabel result2text4 = new JLabel("<html><body><center>한약재가<br>좋습니다</center></body></html>");
	JLabel result3text1 = new JLabel("<html><body><center>나에게는</center></body></html>");
	JLabel result3text2 = new JLabel("<html><body><center>작약</center></body></html>");
	JLabel result3text3 = new JLabel("<html><body><center>계지</center></body></html>");
	JLabel result3text4 = new JLabel("<html><body><center>감초</center></body></html>");
	JLabel result3text5 = new JLabel("<html><body><center>생강</center></body></html>");
	JLabel result3text6 = new JLabel("<html><body><center>한약재가<br>좋습니다</center></body></html>");
	JLabel result4text1 = new JLabel("<html><body><center>나에게는</center></body></html>");
	JLabel result4text2 = new JLabel("<html><body><center>감초</center></body></html>");
	JLabel result4text3 = new JLabel("<html><body><center>백출</center></body></html>");
	JLabel result4text4 = new JLabel("<html><body><center>복령</center></body></html>");
	JLabel result4text5 = new JLabel("<html><body><center>진피</center></body></html>");
	JLabel result4text6 = new JLabel("<html><body><center>한약재가<br>좋습니다</center></body></html>");

	JPanel mainpage = new JPanel() {};
	JPanel q1page = new JPanel() {};
	JPanel q2page = new JPanel() {};
	JPanel q3page = new JPanel() {};
	JPanel q4page = new JPanel() {};
	JPanel q5page = new JPanel() {};
	JPanel q6page = new JPanel() {};
	JPanel q7page = new JPanel() {};
	JPanel q8page = new JPanel() {};
	JPanel q9page = new JPanel() {};
	JPanel q10page = new JPanel() {};
	JPanel q11page = new JPanel() {};
	JPanel q12page = new JPanel() {};
	JPanel q13page = new JPanel() {};
	JPanel q14page = new JPanel() {};
	JPanel q15page = new JPanel() {};
	JPanel q16page = new JPanel() {};
	JPanel q17page = new JPanel() {};
	JPanel q18page = new JPanel() {};
	JPanel q19page = new JPanel() {};
	JPanel q20page = new JPanel() {};
	
	JPanel result1 = new JPanel() {};
	JPanel result2 = new JPanel() {};
	JPanel result3 = new JPanel() {};
	JPanel result4 = new JPanel() {};
	
	public int total1 = 0;
	public int total2 = 0;
	public int total3 = 0;
	public int total4 = 0;
	public void updatecount1(int add) { total1 += add;} 
	public void updatecount2(int add) { total2 += add;} 
	public void updatecount3(int add) { total3 += add;} 
	public void updatecount4(int add) { total4 += add;} 
	
	public Main() {
		framesetting();
		panelsetting();
		bes();
		be1y();be1n();
		be2y();be2n();
		be3y();be3n();
		be4y();be4n();
		be5y();be5n();
		be6y();be6n();
		be7y();be7n();
		be8y();be8n();
		be9y();be9n();
		be10y();be10n();
		be11y();be11n();
		be12y();be12n();
		be13y();be13n();
		be14y();be14n();
		be15y();be15n();
		be16y();be16n();
		be17y();be17n();
		be18y();be18n();
		be19y();be19n();
		be20y();be20n();
		
		restart1();
		restart2();
		restart3();
		restart4();
	}
	public void bes() {
		bes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				mainpage.setVisible(false);
				q1page.setVisible(true);
			} 
		});
	}
	public void be1y() {
		be1y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount1(1);
				q1page.setVisible(false);
				q2page.setVisible(true);
			}
		});
	}
	public void be1n() {
		be1n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q1page.setVisible(false);
				q2page.setVisible(true);
			} 
		});
	}
	public void be2y() {
		be2y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount1(1);
				q2page.setVisible(false);
				q3page.setVisible(true);
			}
		});
	}
	public void be2n() {
		be2n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q2page.setVisible(false);
				q3page.setVisible(true);
			} 
		});
	}
	public void be3y() {
		be3y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount1(1);
				q3page.setVisible(false);
				q4page.setVisible(true);
			}
		});
	}
	public void be3n() {
		be3n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q3page.setVisible(false);
				q4page.setVisible(true);
			} 
		});
	}	
	public void be4y() {
		be4y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount1(1);
				q4page.setVisible(false);
				q5page.setVisible(true);
			}
		});
	}
	public void be4n() {
		be4n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q4page.setVisible(false);
				q5page.setVisible(true);
			} 
		});
	}
	public void be5y() {
		be5y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount1(1);
				q5page.setVisible(false);
				q6page.setVisible(true);
			}
		});
	}
	public void be5n() {
		be5n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q5page.setVisible(false);
				q6page.setVisible(true);
			} 
		});
	}
	public void be6y() {
		be6y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount2(1);
				q6page.setVisible(false);
				q7page.setVisible(true);
			}
		});
	}
	public void be6n() {
		be6n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q6page.setVisible(false);
				q7page.setVisible(true);
			} 
		});
	}
	public void be7y() {
		be7y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount2(1);
				q7page.setVisible(false);
				q8page.setVisible(true);
			}
		});
	}
	public void be7n() {
		be7n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q7page.setVisible(false);
				q8page.setVisible(true);
			} 
		});
	}
	public void be8y() {
		be8y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount2(1);
				q8page.setVisible(false);
				q9page.setVisible(true);
			}
		});
	}
	public void be8n() {
		be8n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q8page.setVisible(false);
				q9page.setVisible(true);
			} 
		});
	}
	public void be9y() {
		be9y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount2(1);
				q9page.setVisible(false);
				q10page.setVisible(true);
			}
		});
	}
	public void be9n() {
		be9n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q9page.setVisible(false);
				q10page.setVisible(true);
			} 
		});
	}
	public void be10y() {
		be10y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount2(1);
				q10page.setVisible(false);
				q11page.setVisible(true);
			}
		});
	}
	public void be10n() {
		be10n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q10page.setVisible(false);
				q11page.setVisible(true);
			} 
		});
	}
	public void be11y() {
		be11y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount3(1);
				q11page.setVisible(false);
				q12page.setVisible(true);
			}
		});
	}
	public void be11n() {
		be11n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q11page.setVisible(false);
				q12page.setVisible(true);
			} 
		});
	}
	public void be12y() {
		be12y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount3(1);
				q12page.setVisible(false);
				q13page.setVisible(true);
			}
		});
	}
	public void be12n() {
		be12n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q12page.setVisible(false);
				q13page.setVisible(true);
			} 
		});
	}
	public void be13y() {
		be13y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount3(1);
				q13page.setVisible(false);
				q14page.setVisible(true);
			}
		});
	}
	public void be13n() {
		be13n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q13page.setVisible(false);
				q14page.setVisible(true);
			} 
		});
	}
	public void be14y() {
		be14y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount3(1);
				q14page.setVisible(false);
				q15page.setVisible(true);
			}
		});
	}
	public void be14n() {
		be14n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q14page.setVisible(false);
				q15page.setVisible(true);
			} 
		});
	}
	public void be15y() {
		be15y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount3(1);
				q15page.setVisible(false);
				q16page.setVisible(true);
			}
		});
	}
	public void be15n() {
		be15n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q15page.setVisible(false);
				q16page.setVisible(true);
			} 
		});
	}
	public void be16y() {
		be16y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount4(1);
				q16page.setVisible(false);
				q17page.setVisible(true);
			}
		});
	}
	public void be16n() {
		be16n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q16page.setVisible(false);
				q17page.setVisible(true);
			} 
		});
	}
	public void be17y() {
		be17y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount4(1);
				q17page.setVisible(false);
				q18page.setVisible(true);
			}
		});
	}
	public void be17n() {
		be17n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q17page.setVisible(false);
				q18page.setVisible(true);
			} 
		});
	}
	public void be18y() {
		be18y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount4(1);
				q18page.setVisible(false);
				q19page.setVisible(true);
			}
		});
	}
	public void be18n() {
		be18n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q18page.setVisible(false);
				q19page.setVisible(true);
			} 
		});
	}
	public void be19y() {
		be19y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount4(1);
				q19page.setVisible(false);
				q20page.setVisible(true);
			}
		});
	}
	public void be19n() {
		be19n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				q19page.setVisible(false);
				q20page.setVisible(true);
			} 
		});
	}
	public void be20y() {
		be20y.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				updatecount4(1);
				if(total1 >= 0 && total1 >= total2 && total1 >= total3 && total1 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(true);
					result2.setVisible(false);
					result3.setVisible(false);
					result4.setVisible(false);
				}
				else if(total2 >= 0 && total2 >= total1 && total2 >= total3 && total2 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(true);
					result3.setVisible(false);
					result4.setVisible(false);
				}
				else if(total3 >= 0 && total3 >= total1 && total3 >= total2 && total3 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(false);
					result3.setVisible(true);
					result4.setVisible(false);
				}
				else if(total4 >= 0 && total4 >= total1 && total4 >= total2 && total4 >= total3) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(false);
					result3.setVisible(false);
					result4.setVisible(true);
				}
			}
		});
	}
	public void be20n() {
		be20n.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				if(total1 >= 0 && total1 >= total2 && total1 >= total3 && total1 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(true);
					result2.setVisible(false);
					result3.setVisible(false);
					result4.setVisible(false);
				}
				else if(total2 >= 0 && total2 >= total1 && total2 >= total3 && total2 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(true);
					result3.setVisible(false);
					result4.setVisible(false);
				}
				else if(total3 >= 0 && total3 >= total1 && total3 >= total2 && total3 >= total4) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(false);
					result3.setVisible(true);
					result4.setVisible(false);
				}
				else if(total4 >= 0 && total4 >= total1 && total4 >= total2 && total4 >= total3) {
					q20page.setVisible(false);
					result1.setVisible(false);
					result2.setVisible(false);
					result3.setVisible(false);
					result4.setVisible(true);
				}
			} 
		});
	}
	public void restart1() {
		restart1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				total1 = 0;
				total2 = 0;
				total3 = 0;
				total4 = 0;
				mainpage.setVisible(true);
				result1.setVisible(false);
			} 
		});
	}
	public void restart2() {
		restart2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				total1 = 0;
				total2 = 0;
				total3 = 0;
				total4 = 0;
				mainpage.setVisible(true);
				result2.setVisible(false);
			} 
		});
	}
	public void restart3() {
		restart3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				total1 = 0;
				total2 = 0;
				total3 = 0;
				total4 = 0;
				mainpage.setVisible(true);
				result3.setVisible(false);
			} 
		});
	}
	public void restart4() {
		restart4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {} 
			@Override
			public void mouseExited(MouseEvent e) {} 
			@Override
			public void mousePressed(MouseEvent e) {
				total1 = 0;
				total2 = 0;
				total3 = 0;
				total4 = 0;
				mainpage.setVisible(true);
				result4.setVisible(false);
			} 
		});
	}
	public void framesetting() {
		JFrame f = new JFrame();
		f.setTitle("Main");
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setUndecorated(true);
		f.setVisible(true);
		f.setSize(1080,1920);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(mainpage,BorderLayout.CENTER);
		f.add(q1page,BorderLayout.CENTER);
		f.add(q2page,BorderLayout.CENTER);
		f.add(q3page,BorderLayout.CENTER);
		f.add(q4page,BorderLayout.CENTER);
		f.add(q5page,BorderLayout.CENTER);
		f.add(q6page,BorderLayout.CENTER);
		f.add(q7page,BorderLayout.CENTER);
		f.add(q8page,BorderLayout.CENTER);
		f.add(q9page,BorderLayout.CENTER);
		f.add(q10page,BorderLayout.CENTER);
		f.add(q11page,BorderLayout.CENTER);
		f.add(q12page,BorderLayout.CENTER);
		f.add(q13page,BorderLayout.CENTER);
		f.add(q14page,BorderLayout.CENTER);
		f.add(q15page,BorderLayout.CENTER);
		f.add(q16page,BorderLayout.CENTER);
		f.add(q17page,BorderLayout.CENTER);
		f.add(q18page,BorderLayout.CENTER);
		f.add(q19page,BorderLayout.CENTER);
		f.add(q20page,BorderLayout.CENTER);
		f.add(result1,BorderLayout.CENTER);
		f.add(result2,BorderLayout.CENTER);
		f.add(result3,BorderLayout.CENTER);
		f.add(result4,BorderLayout.CENTER);
		
	}
	public void panelsetting() {
		Color maincolor = new Color(38,36,123);
		Color textcolor = new Color(255,255,255);
		Color textcolor2 = new Color(255,192,0);
		Font Mainfont = null;
		Font Subfont = null;
		try {
			Mainfont = Font.createFont(Font.TRUETYPE_FONT,  new File("han.ttf")).deriveFont(100f);
			Subfont = Font.createFont(Font.TRUETYPE_FONT,  new File("han.ttf")).deriveFont(75f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("han.ttf")));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
				
		
		//mainpage
	    mainpage.add(bes);
	    mainpage.add(mainpagetext1);
	    mainpage.add(mainpagetext2);
	    mainpage.setBounds(0, 0, 1080, 1920);
		mainpage.setLayout(null);
		mainpage.setBackground(maincolor);
		bes.setBounds(340, 1390, 400, 100);
		bes.setForeground(textcolor2);
		bes.setBackground(maincolor);
		bes.setBorderPainted(false);
		bes.setFont(Mainfont);
		mainpagetext1.setBounds(340, 430, 400, 100 );
		mainpagetext1.setForeground(textcolor2);
		mainpagetext1.setFont(Mainfont);
		mainpagetext2.setBounds(340, 785, 400, 350 );
		mainpagetext2.setForeground(textcolor);
		mainpagetext2.setFont(Mainfont);
		//q1
	    q1page.add(be1y);
	    q1page.add(be1n);
	    q1page.add(q1pagetext1);
	    q1page.add(q1pagetext2);
	    q1page.add(q1pagetext3);
	    q1page.setBounds(0, 0, 1080, 1920);
		q1page.setLayout(null);
		q1page.setBackground(maincolor);
	    q1page.setVisible(false);
		be1y.setBounds(70, 1390, 400, 100);
		be1y.setForeground(textcolor2);
		be1y.setBackground(maincolor);
		be1y.setBorderPainted(false);
		be1y.setFont(Subfont);
		be1n.setBounds(610, 1390, 400, 100);
		be1n.setForeground(textcolor2);
		be1n.setBackground(maincolor);
		be1n.setBorderPainted(false);
		be1n.setFont(Subfont);
		q1pagetext1.setBounds(195, 330, 150, 150 );
		q1pagetext1.setForeground(textcolor);
		q1pagetext1.setFont(Subfont);
		q1pagetext2.setBounds(195, 500, 700, 250 );
		q1pagetext2.setForeground(textcolor2);
		q1pagetext2.setFont(Subfont);
		q1pagetext3.setBounds(660, 960, 300, 200 );
		q1pagetext3.setForeground(textcolor);
		q1pagetext3.setFont(Subfont);
		//q2
	    q2page.add(be2y);
	    q2page.add(be2n);
	    q2page.add(q2pagetext1);
	    q2page.add(q2pagetext2);
	    q2page.add(q2pagetext3);
	    q2page.setBounds(0, 0, 1080, 1920);
		q2page.setLayout(null);
		q2page.setBackground(maincolor);
	    q2page.setVisible(false);
		be2y.setBounds(70, 1390, 400, 100);
		be2y.setForeground(textcolor2);
		be2y.setBackground(maincolor);
		be2y.setBorderPainted(false);
		be2y.setFont(Subfont);
		be2n.setBounds(610, 1390, 400, 100);
		be2n.setForeground(textcolor2);
		be2n.setBackground(maincolor);
		be2n.setBorderPainted(false);
		be2n.setFont(Subfont);
		q2pagetext1.setBounds(195, 330, 150, 150);
		q2pagetext1.setForeground(textcolor);
		q2pagetext1.setFont(Subfont);
		q2pagetext2.setBounds(195, 500, 700, 250);
		q2pagetext2.setForeground(textcolor2);
		q2pagetext2.setFont(Subfont);
		q2pagetext3.setBounds(660, 960, 300, 200);
		q2pagetext3.setForeground(textcolor);
		q2pagetext3.setFont(Subfont);
		//q3
	    q3page.add(be3y);
	    q3page.add(be3n);
	    q3page.add(q3pagetext1);
	    q3page.add(q3pagetext2);
	    q3page.add(q3pagetext3);
	    q3page.setBounds(0, 0, 1080, 1920);
		q3page.setLayout(null);
		q3page.setBackground(maincolor);
	    q3page.setVisible(false);
		be3y.setBounds(70, 1390, 400, 100);
		be3y.setForeground(textcolor2);
		be3y.setBackground(maincolor);
		be3y.setBorderPainted(false);
		be3y.setFont(Subfont);
		be3n.setBounds(610, 1390, 400, 100);
		be3n.setForeground(textcolor2);
		be3n.setBackground(maincolor);
		be3n.setBorderPainted(false);
		be3n.setFont(Subfont);
		q3pagetext1.setBounds(195, 330, 150, 150);
		q3pagetext1.setForeground(textcolor);
		q3pagetext1.setFont(Subfont);
		q3pagetext2.setBounds(195, 500, 700, 250);
		q3pagetext2.setForeground(textcolor2);
		q3pagetext2.setFont(Subfont);
		q3pagetext3.setBounds(660, 960, 300, 200);
		q3pagetext3.setForeground(textcolor);
		q3pagetext3.setFont(Subfont);
		//q4
	    q4page.add(be4y);
	    q4page.add(be4n);
	    q4page.add(q4pagetext1);
	    q4page.add(q4pagetext2);
	    q4page.add(q4pagetext3);
	    q4page.setBounds(0, 0, 1080, 1920);
		q4page.setLayout(null);
		q4page.setBackground(maincolor);
	    q4page.setVisible(false);
		be4y.setBounds(70, 1390, 400, 100);
		be4y.setForeground(textcolor2);
		be4y.setBackground(maincolor);
		be4y.setBorderPainted(false);
		be4y.setFont(Subfont);
		be4n.setBounds(610, 1390, 400, 100);
		be4n.setForeground(textcolor2);
		be4n.setBackground(maincolor);
		be4n.setBorderPainted(false);
		be4n.setFont(Subfont);
		q4pagetext1.setBounds(195, 330, 150, 150);
		q4pagetext1.setForeground(textcolor);
		q4pagetext1.setFont(Subfont);
		q4pagetext2.setBounds(195, 500, 700, 250);
		q4pagetext2.setForeground(textcolor2);
		q4pagetext2.setFont(Subfont);
		q4pagetext3.setBounds(660, 960, 300, 200);
		q4pagetext3.setForeground(textcolor);
		q4pagetext3.setFont(Subfont);
		//q5
	    q5page.add(be5y);
	    q5page.add(be5n);
	    q5page.add(q5pagetext1);
	    q5page.add(q5pagetext2);
	    q5page.add(q5pagetext3);
	    q5page.setBounds(0, 0, 1080, 1920);
		q5page.setLayout(null);
		q5page.setBackground(maincolor);
	    q5page.setVisible(false);
		be5y.setBounds(70, 1390, 400, 100);
		be5y.setForeground(textcolor2);
		be5y.setBackground(maincolor);
		be5y.setBorderPainted(false);
		be5y.setFont(Subfont);
		be5n.setBounds(610, 1390, 400, 100);
		be5n.setForeground(textcolor2);
		be5n.setBackground(maincolor);
		be5n.setBorderPainted(false);
		be5n.setFont(Subfont);
		q5pagetext1.setBounds(195, 330, 150, 150);
		q5pagetext1.setForeground(textcolor);
		q5pagetext1.setFont(Subfont);
		q5pagetext2.setBounds(195, 500, 700, 250);
		q5pagetext2.setForeground(textcolor2);
		q5pagetext2.setFont(Subfont);
		q5pagetext3.setBounds(660, 960, 300, 200);
		q5pagetext3.setForeground(textcolor);
		q5pagetext3.setFont(Subfont);
		//q6
	    q6page.add(be6y);
	    q6page.add(be6n);
	    q6page.add(q6pagetext1);
	    q6page.add(q6pagetext2);
	    q6page.add(q6pagetext3);
	    q6page.setBounds(0, 0, 1080, 1920);
		q6page.setLayout(null);
		q6page.setBackground(maincolor);
	    q6page.setVisible(false);
		be6y.setBounds(70, 1390, 400, 100);
		be6y.setForeground(textcolor2);
		be6y.setBackground(maincolor);
		be6y.setBorderPainted(false);
		be6y.setFont(Subfont);
		be6n.setBounds(610, 1390, 400, 100);
		be6n.setForeground(textcolor2);
		be6n.setBackground(maincolor);
		be6n.setBorderPainted(false);
		be6n.setFont(Subfont);
		q6pagetext1.setBounds(195, 330, 150, 150);
		q6pagetext1.setForeground(textcolor);
		q6pagetext1.setFont(Subfont);
		q6pagetext2.setBounds(195, 500, 700, 250);
		q6pagetext2.setForeground(textcolor2);
		q6pagetext2.setFont(Subfont);
		q6pagetext3.setBounds(660, 960, 300, 200);
		q6pagetext3.setForeground(textcolor);
		q6pagetext3.setFont(Subfont);
		//q7
	    q7page.add(be7y);
	    q7page.add(be7n);
	    q7page.add(q7pagetext1);
	    q7page.add(q7pagetext2);
	    q7page.add(q7pagetext3);
	    q7page.setBounds(0, 0, 1080, 1920);
		q7page.setLayout(null);
		q7page.setBackground(maincolor);
	    q7page.setVisible(false);
		be7y.setBounds(70, 1390, 400, 100);
		be7y.setForeground(textcolor2);
		be7y.setBackground(maincolor);
		be7y.setBorderPainted(false);
		be7y.setFont(Subfont);
		be7n.setBounds(610, 1390, 400, 100);
		be7n.setForeground(textcolor2);
		be7n.setBackground(maincolor);
		be7n.setBorderPainted(false);
		be7n.setFont(Subfont);
		q7pagetext1.setBounds(195, 330, 150, 150);
		q7pagetext1.setForeground(textcolor);
		q7pagetext1.setFont(Subfont);
		q7pagetext2.setBounds(195, 500, 700, 250);
		q7pagetext2.setForeground(textcolor2);
		q7pagetext2.setFont(Subfont);
		q7pagetext3.setBounds(660, 960, 300, 200);
		q7pagetext3.setForeground(textcolor);
		q7pagetext3.setFont(Subfont);
		//q8
	    q8page.add(be8y);
	    q8page.add(be8n);
	    q8page.add(q8pagetext1);
	    q8page.add(q8pagetext2);
	    q8page.add(q8pagetext3);
	    q8page.setBounds(0, 0, 1080, 1920);
		q8page.setLayout(null);
		q8page.setBackground(maincolor);
	    q8page.setVisible(false);
		be8y.setBounds(70, 1390, 400, 100);
		be8y.setForeground(textcolor2);
		be8y.setBackground(maincolor);
		be8y.setBorderPainted(false);
		be8y.setFont(Subfont);
		be8n.setBounds(610, 1390, 400, 100);
		be8n.setForeground(textcolor2);
		be8n.setBackground(maincolor);
		be8n.setBorderPainted(false);
		be8n.setFont(Subfont);
		q8pagetext1.setBounds(195, 330, 150, 150);
		q8pagetext1.setForeground(textcolor);
		q8pagetext1.setFont(Subfont);
		q8pagetext2.setBounds(195, 500, 700, 250);
		q8pagetext2.setForeground(textcolor2);
		q8pagetext2.setFont(Subfont);
		q8pagetext3.setBounds(660, 960, 300, 200);
		q8pagetext3.setForeground(textcolor);
		q8pagetext3.setFont(Subfont);
		//q9
	    q9page.add(be9y);
	    q9page.add(be9n);
	    q9page.add(q9pagetext1);
	    q9page.add(q9pagetext2);
	    q9page.add(q9pagetext3);
	    q9page.setBounds(0, 0, 1080, 1920);
		q9page.setLayout(null);
		q9page.setBackground(maincolor);
	    q9page.setVisible(false);
		be9y.setBounds(70, 1390, 400, 100);
		be9y.setForeground(textcolor2);
		be9y.setBackground(maincolor);
		be9y.setBorderPainted(false);
		be9y.setFont(Subfont);
		be9n.setBounds(610, 1390, 400, 100);
		be9n.setForeground(textcolor2);
		be9n.setBackground(maincolor);
		be9n.setBorderPainted(false);
		be9n.setFont(Subfont);
		q9pagetext1.setBounds(195, 330, 150, 150);
		q9pagetext1.setForeground(textcolor);
		q9pagetext1.setFont(Subfont);
		q9pagetext2.setBounds(195, 500, 700, 250);
		q9pagetext2.setForeground(textcolor2);
		q9pagetext2.setFont(Subfont);
		q9pagetext3.setBounds(660, 960, 300, 200);
		q9pagetext3.setForeground(textcolor);
		q9pagetext3.setFont(Subfont);
		//q10
	    q10page.add(be10y);
	    q10page.add(be10n);
	    q10page.add(q10pagetext1);
	    q10page.add(q10pagetext2);
	    q10page.add(q10pagetext3);
	    q10page.setBounds(0, 0, 1080, 1920);
		q10page.setLayout(null);
		q10page.setBackground(maincolor);
	    q10page.setVisible(false);
		be10y.setBounds(70, 1390, 400, 100);
		be10y.setForeground(textcolor2);
		be10y.setBackground(maincolor);
		be10y.setBorderPainted(false);
		be10y.setFont(Subfont);
		be10n.setBounds(610, 1390, 400, 100);
		be10n.setForeground(textcolor2);
		be10n.setBackground(maincolor);
		be10n.setBorderPainted(false);
		be10n.setFont(Subfont);
		q10pagetext1.setBounds(195, 330, 150, 150);
		q10pagetext1.setForeground(textcolor);
		q10pagetext1.setFont(Subfont);
		q10pagetext2.setBounds(195, 500, 700, 250);
		q10pagetext2.setForeground(textcolor2);
		q10pagetext2.setFont(Subfont);
		q10pagetext3.setBounds(660, 960, 350, 200);
		q10pagetext3.setForeground(textcolor);
		q10pagetext3.setFont(Subfont);
		//q11
	    q11page.add(be11y);
	    q11page.add(be11n);
	    q11page.add(q11pagetext1);
	    q11page.add(q11pagetext2);
	    q11page.add(q11pagetext3);
	    q11page.setBounds(0, 0, 1080, 1920);
		q11page.setLayout(null);
		q11page.setBackground(maincolor);
	    q11page.setVisible(false);
		be11y.setBounds(70, 1390, 400, 100);
		be11y.setForeground(textcolor2);
		be11y.setBackground(maincolor);
		be11y.setBorderPainted(false);
		be11y.setFont(Subfont);
		be11n.setBounds(610, 1390, 400, 100);
		be11n.setForeground(textcolor2);
		be11n.setBackground(maincolor);
		be11n.setBorderPainted(false);
		be11n.setFont(Subfont);
		q11pagetext1.setBounds(195, 330, 150, 150);
		q11pagetext1.setForeground(textcolor);
		q11pagetext1.setFont(Subfont);
		q11pagetext2.setBounds(195, 500, 700, 250);
		q11pagetext2.setForeground(textcolor2);
		q11pagetext2.setFont(Subfont);
		q11pagetext3.setBounds(660, 960, 350, 200);
		q11pagetext3.setForeground(textcolor);
		q11pagetext3.setFont(Subfont);
		//q12
	    q12page.add(be12y);
	    q12page.add(be12n);
	    q12page.add(q12pagetext1);
	    q12page.add(q12pagetext2);
	    q12page.add(q12pagetext3);
	    q12page.setBounds(0, 0, 1080, 1920);
		q12page.setLayout(null);
		q12page.setBackground(maincolor);
	    q12page.setVisible(false);
		be12y.setBounds(70, 1390, 400, 100);
		be12y.setForeground(textcolor2);
		be12y.setBackground(maincolor);
		be12y.setBorderPainted(false);
		be12y.setFont(Subfont);
		be12n.setBounds(610, 1390, 400, 100);
		be12n.setForeground(textcolor2);
		be12n.setBackground(maincolor);
		be12n.setBorderPainted(false);
		be12n.setFont(Subfont);
		q12pagetext1.setBounds(195, 330, 150, 150);
		q12pagetext1.setForeground(textcolor);
		q12pagetext1.setFont(Subfont);
		q12pagetext2.setBounds(195, 500, 700, 250);
		q12pagetext2.setForeground(textcolor2);
		q12pagetext2.setFont(Subfont);
		q12pagetext3.setBounds(660, 960, 350, 200);
		q12pagetext3.setForeground(textcolor);
		q12pagetext3.setFont(Subfont);
		//q13
	    q13page.add(be13y);
	    q13page.add(be13n);
	    q13page.add(q13pagetext1);
	    q13page.add(q13pagetext2);
	    q13page.add(q13pagetext3);
	    q13page.setBounds(0, 0, 1080, 1920);
		q13page.setLayout(null);
		q13page.setBackground(maincolor);
	    q13page.setVisible(false);
		be13y.setBounds(70, 1390, 400, 100);
		be13y.setForeground(textcolor2);
		be13y.setBackground(maincolor);
		be13y.setBorderPainted(false);
		be13y.setFont(Subfont);
		be13n.setBounds(610, 1390, 400, 100);
		be13n.setForeground(textcolor2);
		be13n.setBackground(maincolor);
		be13n.setBorderPainted(false);
		be13n.setFont(Subfont);
		q13pagetext1.setBounds(195, 330, 150, 150);
		q13pagetext1.setForeground(textcolor);
		q13pagetext1.setFont(Subfont);
		q13pagetext2.setBounds(195, 500, 800, 250);
		q13pagetext2.setForeground(textcolor2);
		q13pagetext2.setFont(Subfont);
		q13pagetext3.setBounds(660, 960, 350, 200);
		q13pagetext3.setForeground(textcolor);
		q13pagetext3.setFont(Subfont);
		//q14
	    q14page.add(be14y);
	    q14page.add(be14n);
	    q14page.add(q14pagetext1);
	    q14page.add(q14pagetext2);
	    q14page.add(q14pagetext3);
	    q14page.setBounds(0, 0, 1080, 1920);
		q14page.setLayout(null);
		q14page.setBackground(maincolor);
	    q14page.setVisible(false);
		be14y.setBounds(70, 1390, 400, 100);
		be14y.setForeground(textcolor2);
		be14y.setBackground(maincolor);
		be14y.setBorderPainted(false);
		be14y.setFont(Subfont);
		be14n.setBounds(610, 1390, 400, 100);
		be14n.setForeground(textcolor2);
		be14n.setBackground(maincolor);
		be14n.setBorderPainted(false);
		be14n.setFont(Subfont);
		q14pagetext1.setBounds(195, 330, 150, 150);
		q14pagetext1.setForeground(textcolor);
		q14pagetext1.setFont(Subfont);
		q14pagetext2.setBounds(195, 500, 700, 250);
		q14pagetext2.setForeground(textcolor2);
		q14pagetext2.setFont(Subfont);
		q14pagetext3.setBounds(660, 960, 350, 200);
		q14pagetext3.setForeground(textcolor);
		q14pagetext3.setFont(Subfont);	
		//q15
	    q15page.add(be15y);
	    q15page.add(be15n);
	    q15page.add(q15pagetext1);
	    q15page.add(q15pagetext2);
	    q15page.add(q15pagetext3);
	    q15page.setBounds(0, 0, 1080, 1920);
		q15page.setLayout(null);
		q15page.setBackground(maincolor);
	    q15page.setVisible(false);
		be15y.setBounds(70, 1390, 400, 100);
		be15y.setForeground(textcolor2);
		be15y.setBackground(maincolor);
		be15y.setBorderPainted(false);
		be15y.setFont(Subfont);
		be15n.setBounds(610, 1390, 400, 100);
		be15n.setForeground(textcolor2);
		be15n.setBackground(maincolor);
		be15n.setBorderPainted(false);
		be15n.setFont(Subfont);
		q15pagetext1.setBounds(195, 330, 150, 150);
		q15pagetext1.setForeground(textcolor);
		q15pagetext1.setFont(Subfont);
		q15pagetext2.setBounds(195, 500, 800, 250);
		q15pagetext2.setForeground(textcolor2);
		q15pagetext2.setFont(Subfont);
		q15pagetext3.setBounds(660, 960, 350, 200);
		q15pagetext3.setForeground(textcolor);
		q15pagetext3.setFont(Subfont);
		//q16
	    q16page.add(be16y);
	    q16page.add(be16n);
	    q16page.add(q16pagetext1);
	    q16page.add(q16pagetext2);
	    q16page.add(q16pagetext3);
	    q16page.setBounds(0, 0, 1080, 1920);
		q16page.setLayout(null);
		q16page.setBackground(maincolor);
	    q16page.setVisible(false);
		be16y.setBounds(70, 1390, 400, 100);
		be16y.setForeground(textcolor2);
		be16y.setBackground(maincolor);
		be16y.setBorderPainted(false);
		be16y.setFont(Subfont);
		be16n.setBounds(610, 1390, 400, 100);
		be16n.setForeground(textcolor2);
		be16n.setBackground(maincolor);
		be16n.setBorderPainted(false);
		be16n.setFont(Subfont);
		q16pagetext1.setBounds(195, 330, 150, 150);
		q16pagetext1.setForeground(textcolor);
		q16pagetext1.setFont(Subfont);
		q16pagetext2.setBounds(195, 500, 700, 250);
		q16pagetext2.setForeground(textcolor2);
		q16pagetext2.setFont(Subfont);
		q16pagetext3.setBounds(660, 960, 350, 200);
		q16pagetext3.setForeground(textcolor);
		q16pagetext3.setFont(Subfont);
		//q17
	    q17page.add(be17y);
	    q17page.add(be17n);
	    q17page.add(q17pagetext1);
	    q17page.add(q17pagetext2);
	    q17page.add(q17pagetext3);
	    q17page.setBounds(0, 0, 1080, 1920);
		q17page.setLayout(null);
		q17page.setBackground(maincolor);
	    q17page.setVisible(false);
		be17y.setBounds(70, 1390, 400, 100);
		be17y.setForeground(textcolor2);
		be17y.setBackground(maincolor);
		be17y.setBorderPainted(false);
		be17y.setFont(Subfont);
		be17n.setBounds(610, 1390, 400, 100);
		be17n.setForeground(textcolor2);
		be17n.setBackground(maincolor);
		be17n.setBorderPainted(false);
		be17n.setFont(Subfont);
		q17pagetext1.setBounds(195, 330, 150, 150);
		q17pagetext1.setForeground(textcolor);
		q17pagetext1.setFont(Subfont);
		q17pagetext2.setBounds(195, 500, 700, 250);
		q17pagetext2.setForeground(textcolor2);
		q17pagetext2.setFont(Subfont);
		q17pagetext3.setBounds(660, 960, 350, 200);
		q17pagetext3.setForeground(textcolor);
		q17pagetext3.setFont(Subfont);
		//q18
	    q18page.add(be18y);
	    q18page.add(be18n);
	    q18page.add(q18pagetext1);
	    q18page.add(q18pagetext2);
	    q18page.add(q18pagetext3);
	    q18page.setBounds(0, 0, 1080, 1920);
		q18page.setLayout(null);
		q18page.setBackground(maincolor);
	    q18page.setVisible(false);
		be18y.setBounds(70, 1390, 400, 100);
		be18y.setForeground(textcolor2);
		be18y.setBackground(maincolor);
		be18y.setBorderPainted(false);
		be18y.setFont(Subfont);
		be18n.setBounds(610, 1390, 400, 100);
		be18n.setForeground(textcolor2);
		be18n.setBackground(maincolor);
		be18n.setBorderPainted(false);
		be18n.setFont(Subfont);
		q18pagetext1.setBounds(195, 330, 150, 150);
		q18pagetext1.setForeground(textcolor);
		q18pagetext1.setFont(Subfont);
		q18pagetext2.setBounds(195, 500, 800, 250);
		q18pagetext2.setForeground(textcolor2);
		q18pagetext2.setFont(Subfont);
		q18pagetext3.setBounds(660, 960, 350, 200);
		q18pagetext3.setForeground(textcolor);
		q18pagetext3.setFont(Subfont);
		//q19
	    q19page.add(be19y);
	    q19page.add(be19n);
	    q19page.add(q19pagetext1);
	    q19page.add(q19pagetext2);
	    q19page.add(q19pagetext3);
	    q19page.setBounds(0, 0, 1080, 1920);
		q19page.setLayout(null);
		q19page.setBackground(maincolor);
	    q19page.setVisible(false);
		be19y.setBounds(70, 1390, 400, 100);
		be19y.setForeground(textcolor2);
		be19y.setBackground(maincolor);
		be19y.setBorderPainted(false);
		be19y.setFont(Subfont);
		be19n.setBounds(610, 1390, 400, 100);
		be19n.setForeground(textcolor2);
		be19n.setBackground(maincolor);
		be19n.setBorderPainted(false);
		be19n.setFont(Subfont);
		q19pagetext1.setBounds(195, 330, 150, 150);
		q19pagetext1.setForeground(textcolor);
		q19pagetext1.setFont(Subfont);
		q19pagetext2.setBounds(195, 500, 700, 250);
		q19pagetext2.setForeground(textcolor2);
		q19pagetext2.setFont(Subfont);
		q19pagetext3.setBounds(660, 960, 350, 200);
		q19pagetext3.setForeground(textcolor);
		q19pagetext3.setFont(Subfont);
		//q20
	    q20page.add(be20y);
	    q20page.add(be20n);
	    q20page.add(q20pagetext1);
	    q20page.add(q20pagetext2);
	    q20page.add(q20pagetext3);
	    q20page.setBounds(0, 0, 1080, 1920);
		q20page.setLayout(null);
		q20page.setBackground(maincolor);
	    q20page.setVisible(false);
		be20y.setBounds(70, 1390, 400, 100);
		be20y.setForeground(textcolor2);
		be20y.setBackground(maincolor);
		be20y.setBorderPainted(false);
		be20y.setFont(Subfont);
		be20n.setBounds(610, 1390, 400, 100);
		be20n.setForeground(textcolor2);
		be20n.setBackground(maincolor);
		be20n.setBorderPainted(false);
		be20n.setFont(Subfont);
		q20pagetext1.setBounds(195, 330, 150, 150);
		q20pagetext1.setForeground(textcolor);
		q20pagetext1.setFont(Subfont);
		q20pagetext2.setBounds(195, 500, 700, 250);
		q20pagetext2.setForeground(textcolor2);
		q20pagetext2.setFont(Subfont);
		q20pagetext3.setBounds(660, 960, 350, 200);
		q20pagetext3.setForeground(textcolor);
		q20pagetext3.setFont(Subfont);
		
		//result1
	    result1.add(restart1);
	    result1.add(result1text1);
	    result1.add(result1text2);
	    result1.add(result1text3);
	    result1.add(result1text4);
	    result1.add(result1text5);
	    result1.setBounds(0, 0, 1080, 1920);
	    result1.setLayout(null);
		result1.setBackground(maincolor);
		result1.setVisible(false);
		restart1.setBounds(370, 1490, 400, 100);
		restart1.setForeground(textcolor2);
		restart1.setBackground(maincolor);
		restart1.setBorderPainted(false);
		restart1.setFont(Mainfont);
		result1text1.setBounds(390, 380, 400, 100);
		result1text1.setForeground(textcolor);
		result1text1.setFont(Mainfont);
		result1text2.setBounds(500, 636, 300, 100);
		result1text2.setForeground(textcolor2);
		result1text2.setFont(Subfont);
		result1text3.setBounds(500, 736, 300, 100);
		result1text3.setForeground(textcolor2);
		result1text3.setFont(Subfont);
		result1text4.setBounds(500, 836, 300, 100);
		result1text4.setForeground(textcolor2);
		result1text4.setFont(Subfont);
		result1text5.setBounds(390, 1090, 400, 300);
		result1text5.setForeground(textcolor);
		result1text5.setFont(Mainfont);
		//result2
	    result2.add(restart2);
	    result2.add(result2text1);
	    result2.add(result2text2);
	    result2.add(result2text3);
	    result2.add(result2text4);
	    result2.setBounds(0, 0, 1080, 1920);
	    result2.setLayout(null);
		result2.setBackground(maincolor);
		result2.setVisible(false);
		restart2.setBounds(370, 1490, 400, 100);
		restart2.setForeground(textcolor2);
		restart2.setBackground(maincolor);
		restart2.setBorderPainted(false);
		restart2.setFont(Mainfont);
		result2text1.setBounds(390, 380, 400, 100);
		result2text1.setForeground(textcolor);
		result2text1.setFont(Mainfont);
		result2text2.setBounds(465, 685, 300, 100 );
		result2text2.setForeground(textcolor2);
		result2text2.setFont(Subfont);
		result2text3.setBounds(465, 785, 300, 100 );
		result2text3.setForeground(textcolor2);
		result2text3.setFont(Subfont);
		result2text4.setBounds(390, 1090, 400, 300);
		result2text4.setForeground(textcolor);
		result2text4.setFont(Mainfont);
		//result3
	    result3.add(restart3);
	    result3.add(result3text1);
	    result3.add(result3text2);
	    result3.add(result3text3);
	    result3.add(result3text4);
	    result3.add(result3text5);
	    result3.add(result3text6);
	    result3.setBounds(0, 0, 1080, 1920);
	    result3.setLayout(null);
		result3.setBackground(maincolor);
		result3.setVisible(false);
		restart3.setBounds(370, 1490, 400, 100);
		restart3.setForeground(textcolor2);
		restart3.setBackground(maincolor);
		restart3.setBorderPainted(false);
		restart3.setFont(Mainfont);
		result3text1.setBounds(390, 380, 400, 100);
		result3text1.setForeground(textcolor);
		result3text1.setFont(Mainfont);
		result3text2.setBounds(500, 585, 300, 100 );
		result3text2.setForeground(textcolor2);
		result3text2.setFont(Subfont);
		result3text3.setBounds(500, 685, 300, 100 );
		result3text3.setForeground(textcolor2);
		result3text3.setFont(Subfont);
		result3text4.setBounds(500, 785, 300, 100 );
		result3text4.setForeground(textcolor2);
		result3text4.setFont(Subfont);
		result3text5.setBounds(500, 885, 300, 100 );
		result3text5.setForeground(textcolor2);
		result3text5.setFont(Subfont);
		result3text6.setBounds(390, 1090, 400, 300);
		result3text6.setForeground(textcolor);
		result3text6.setFont(Mainfont);
		//result4
	    result4.add(restart4);
	    result4.add(result4text1);
	    result4.add(result4text2);
	    result4.add(result4text3);
	    result4.add(result4text4);
	    result4.add(result4text5);
	    result4.add(result4text6);
	    result4.setBounds(0, 0, 1080, 1920);
	    result4.setLayout(null);
		result4.setBackground(maincolor);
		result4.setVisible(false);
		restart4.setBounds(370, 1490, 400, 100);
		restart4.setForeground(textcolor2);
		restart4.setBackground(maincolor);
		restart4.setBorderPainted(false);
		restart4.setFont(Mainfont);
		result4text1.setBounds(390, 380, 400, 100);
		result4text1.setForeground(textcolor);
		result4text1.setFont(Mainfont);
		result4text2.setBounds(500, 585, 300, 100 );
		result4text2.setForeground(textcolor2);
		result4text2.setFont(Subfont);
		result4text3.setBounds(500, 685, 300, 100 );
		result4text3.setForeground(textcolor2);
		result4text3.setFont(Subfont);
		result4text4.setBounds(500, 785, 300, 100 );
		result4text4.setForeground(textcolor2);
		result4text4.setFont(Subfont);
		result4text5.setBounds(500, 885, 300, 100 );
		result4text5.setForeground(textcolor2);
		result4text5.setFont(Subfont);
		result4text6.setBounds(390, 1090, 400, 300);
		result4text6.setForeground(textcolor);
		result4text6.setFont(Mainfont);
	}
	public static void main(String[] args) {
		new Main();
	}
}
