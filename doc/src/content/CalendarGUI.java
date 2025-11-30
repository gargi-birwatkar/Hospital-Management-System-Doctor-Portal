
package content;
import static content.appointment.count;
import static content.appointment.date;
import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.Dimension;  
import java.awt.FlowLayout;  
import java.awt.Font;  
import java.awt.GridLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;  
import javax.swing.JButton;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JTextField;  
import javax.swing.SwingUtilities;  
import javax.swing.table.DefaultTableModel;

 public class CalendarGUI extends JPanel { 
     private static final String[] DAY_NAMES = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }; 
     private static final String[] MONTH_NAMES = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
     private Color backgroundColor; 
     public  JComboBox monthComboBox;
   JLabel[][] dayLabel;
     private JLabel titleLabel; 
     private JTextField dayField; 
     public  JTextField yearField; 
     private LocalDate calendarDate;
     private String date;
     private JLabel previouslySelectedLabel = null;
    private Color previousBackgroundColor = null;

             
     //appointment appointmentInstance
     public CalendarGUI() {
         //this.appointmentInstance = appointmentInstance;
         this.calendarDate = LocalDate.now(); 
         setLayout(new BorderLayout()); 
         add(createTopPanel(), BorderLayout.BEFORE_FIRST_LINE); 
         add(createCalendarPanel(), BorderLayout.CENTER); }
     private JPanel createTopPanel() { JPanel panel = new JPanel(new BorderLayout()); 
     panel.add(createDatePanel(), BorderLayout.BEFORE_FIRST_LINE);
     panel.add(createTitlePanel(), BorderLayout.AFTER_LAST_LINE); 
     panel.setBackground(Color.WHITE);
     return panel; 
     } 
	
	private JPanel createDatePanel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		Font font = panel.getFont().deriveFont(12f);
		
		JButton previousYearButton = new JButton("<<");
                previousYearButton.setBackground(new Color(0,51,153));
                previousYearButton.setForeground(Color.WHITE);
		previousYearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int year = Integer.valueOf(yearField.getText()) - 1;
				yearField.setText(Integer.toString(year));
				updateDayLabels();
			}
		});
		panel.add(previousYearButton);
		
		JButton previousMonthButton = new JButton("<");
                 previousMonthButton.setBackground(new Color(0,51,153));
                previousMonthButton.setForeground(Color.WHITE);
		previousMonthButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int month = monthComboBox.getSelectedIndex();
				month--;
				if (month < 0) {
					int year = Integer.valueOf(yearField.getText()) - 1;
					yearField.setText(Integer.toString(year));
					month = 11;
				}
				monthComboBox.setSelectedIndex(month);
				updateDayLabels();
			}
		});
		panel.add(previousMonthButton);
                
               //top panel colour
		panel.setBackground(Color.WHITE);
		monthComboBox = new JComboBox<>(MONTH_NAMES);
		monthComboBox.setEditable(false);
		monthComboBox.setFont(font);
                monthComboBox.setBackground(new Color(0,51,153));
               monthComboBox.setForeground(Color.WHITE);
		monthComboBox.setSelectedIndex(calendarDate.getMonth().ordinal());
		panel.add(monthComboBox);
		
		dayField = new JTextField(2);
		dayField.setFont(font);
                dayField.setBackground(new Color(0,51,153));
               dayField.setForeground(Color.WHITE);
		dayField.setText(Integer.toString(calendarDate.getDayOfMonth()));
		panel.add(dayField);
		
		yearField = new JTextField(4);
                
		yearField.setFont(font);
                 yearField.setBackground(new Color(0,51,153));
               yearField.setForeground(Color.WHITE);
		yearField.setText(Integer.toString(calendarDate.getYear()));
		panel.add(yearField);
		
		JButton button = new JButton("Create Calendar");
                 button.setBackground(new Color(0,51,153));
                button.setForeground(Color.WHITE);
		button.addActionListener(new CalendarListener());
                
		button.setFont(font);
		panel.add(button);
		
		JButton nextMonthButton = new JButton(">");
                nextMonthButton.setBackground(new Color(0,51,153));
                nextMonthButton.setForeground(Color.WHITE);
		nextMonthButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int month = monthComboBox.getSelectedIndex();
				month++;
				if (month > 11) {
					int year = Integer.valueOf(yearField.getText()) + 1;
					yearField.setText(Integer.toString(year));
					month = 0;
				}
				monthComboBox.setSelectedIndex(month);
				updateDayLabels();
			}
		});
		panel.add(nextMonthButton);
		
		JButton nextYearButton = new JButton(">>");
               nextYearButton.setBackground(new Color(0,51,153));
                nextYearButton.setForeground(Color.WHITE);
		nextYearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				int year = Integer.valueOf(yearField.getText()) + 1;
				yearField.setText(Integer.toString(year));
				updateDayLabels();
			}
		});
		panel.add(nextYearButton);
		
		return panel;
	}
	
	private JPanel createTitlePanel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		Font font = panel.getFont().deriveFont(40f).deriveFont(Font.BOLD);
                
             //july moth name panel
		panel.setBackground(new Color(255, 174, 61));
		titleLabel = new JLabel(" ");
		titleLabel.setFont(font);
		panel.add(titleLabel);
		
		return panel;
	}
	
	private JPanel createCalendarPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		backgroundColor = panel.getBackground();
		panel.setBackground(Color.WHITE);
		panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		
		panel.add(createWeekdayLabels(), BorderLayout.BEFORE_FIRST_LINE);
		panel.add(createDayLabels(), BorderLayout.CENTER);
		updateDayLabels();
		
		return panel;
	}

	private JPanel createWeekdayLabels() {
		JPanel panel = new JPanel(new GridLayout(0, DAY_NAMES.length, 5, 5));
		Font dayNamesFont = panel.getFont().deriveFont(12f);
		
		for (int i = 0; i < DAY_NAMES.length; i++) {
			JPanel dayPanel = new JPanel(new BorderLayout());
			dayPanel.setPreferredSize(new Dimension(80, 40));
                        
                        
                     //week days colour
			dayPanel.setBackground(new Color(228,241,238));
			JLabel label = new JLabel(DAY_NAMES[i]);
			label.setFont(dayNamesFont);
			label.setHorizontalAlignment(JLabel.CENTER);
			dayPanel.add(label, BorderLayout.CENTER);
			
			panel.add(dayPanel);
		}
		
		return panel;
	}

	private JPanel createDayLabels() {
		JPanel panel = new JPanel(new GridLayout(0, DAY_NAMES.length, 5, 5));
		dayLabel = new JLabel[6][DAY_NAMES.length];
		Font dayFont = panel.getFont().deriveFont(48f).deriveFont(Font.BOLD); 
		
		for (int j = 0; j < dayLabel.length; j++) {
			for (int i = 0; i < dayLabel[j].length; i++) {
				JPanel dayPanel = new JPanel(new BorderLayout());
				dayPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
				dayPanel.setPreferredSize(new Dimension(80, 80));
				
				dayLabel[j][i] = new JLabel(" ");
				dayLabel[j][i].setFont(dayFont);
				dayLabel[j][i].setHorizontalAlignment(JLabel.CENTER);
                                
                              
                   
                    dayLabel[j][i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JLabel clickedLabel = (JLabel) e.getSource();
                        if (previouslySelectedLabel != null) {
                            previouslySelectedLabel.setOpaque(false);
                            previouslySelectedLabel.setBackground(Color.WHITE);
                            previouslySelectedLabel.repaint();
                        }
                        clickedLabel.setOpaque(true);
                        clickedLabel.setBackground(Color.RED);
                        clickedLabel.repaint();
                        previouslySelectedLabel = clickedLabel;
                    }
                });
                    
                                
        
				dayPanel.add(dayLabel[j][i], BorderLayout.CENTER);
				
				panel.add(dayPanel);
			}
		}
		return panel;
	}
        
	public String returndate(){
            return this.date;
        }
        
	public void updateDayLabels() {
		int month = monthComboBox.getSelectedIndex();
		int day = valueOf(dayField.getText().trim());
		int year = valueOf(yearField.getText().trim());
		
		if (year > 0 && day > 0) {
			calendarDate = LocalDate.of(year, month + 1, day);
			LocalDate monthDate = getPreviousSunday(year, month);
			fillDays(monthDate, year, month, day);	
			
			String title = MONTH_NAMES[month] + " " + year;
			titleLabel.setText(title);
		} 
	}

	private LocalDate getPreviousSunday(int year, int month) {
		LocalDate monthDate = LocalDate.of(year, month + 1, 1);
		int weekday = monthDate.getDayOfWeek().ordinal();
		if (weekday < 6) {
			monthDate = monthDate.minusDays((long) (weekday + 1));
		}
		return monthDate;
	}

	private void fillDays(LocalDate monthDate, int year, int month, int day) {
		for (int j = 0; j < dayLabel.length; j++) {
			for (int i = 0; i < dayLabel[j].length; i++) {
				int calMonth = monthDate.getMonth().ordinal();
				int calYear = monthDate.getYear();
                                
				dayLabel[j][i].getParent().setBackground(Color.WHITE);
                                
				dayLabel[j][i].setText(" ");
				if (year == calYear && month == calMonth) {
					int calDay = monthDate.getDayOfMonth();
					dayLabel[j][i].setText(Integer.toString(calDay));
					if (day == calDay) {
						dayLabel[j][i].getParent().setBackground(Color.YELLOW);
					} 
				}
                                 
				monthDate = monthDate.plusDays(1L);
			}
		}
	}
	
	public int valueOf(String text) {
		try {
			return Integer.valueOf(text);
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
	public class CalendarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			updateDayLabels();
		}
		
	}

}

