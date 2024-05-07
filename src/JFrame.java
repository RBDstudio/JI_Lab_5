import javax.swing.table.DefaultTableModel;
import java.util.Collection;
import java.util.LinkedList;
import java.lang.Math;
import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Scanner;



/**
 *
 * @author RBDstudio
 */

//public class RecIntegral
public class JFrame extends javax.swing.JFrame {
    
    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lower_bound_ent = new javax.swing.JTextField();
        step_ent = new javax.swing.JTextField();
        upper_bound_ent = new javax.swing.JTextField();
        Add_button = new javax.swing.JButton();
        UBtext = new javax.swing.JLabel();
        DBtext = new javax.swing.JLabel();
        Stext = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        MainTable = new javax.swing.JTabbedPane();
        CurrentTable = new javax.swing.JScrollPane();
        CurTable = new javax.swing.JTable();
        ConteinerTable = new javax.swing.JScrollPane();
        ConTable = new javax.swing.JTable();
        ActionMenu = new javax.swing.JTabbedPane();
        CalTable = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Calcul_button = new javax.swing.JButton();
        DeleteMain_Button = new javax.swing.JButton();
        SaveConteiner_Button = new javax.swing.JButton();
        DeleteMain_Button1 = new javax.swing.JButton();
        SaveTable = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Return_Button = new javax.swing.JButton();
        DeteleCont_button = new javax.swing.JButton();
        CleanCont_Button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        lower_bound_ent.setText("0");
        lower_bound_ent.setToolTipText("введите нижнюю границу");
        lower_bound_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower_bound_entActionPerformed(evt);
            }
        });

        step_ent.setText("0.001");
        step_ent.setToolTipText("введите шаг");

        upper_bound_ent.setText("1");
        upper_bound_ent.setToolTipText("введите верхнюю границу");
        upper_bound_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upper_bound_entActionPerformed(evt);
            }
        });

        Add_button.setText("добавить");
        Add_button.setToolTipText("добавляет введёные значения в таблицу");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        UBtext.setText("верхняя граница");

        DBtext.setText("нижняя граница");

        Stext.setText(" шаг");
        Stext.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        Logo.setText("jLabel4");

        MainTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        CurTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "нижняя гр.", "верхняя гр.", "шаг", "результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CurTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CurrentTable.setViewportView(CurTable);

        MainTable.addTab("главная", CurrentTable);

        ConTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "нижняя гр.", "верхняя гр.", "шаг", "результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ConTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ConTable.setShowGrid(false);
        ConteinerTable.setViewportView(ConTable);

        MainTable.addTab("контейнер", ConteinerTable);

        ActionMenu.setToolTipText("выбор режима");

        CalTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Calcul_button.setText("вычислить");
        Calcul_button.setToolTipText("вычисляет значение выбранной строки");
        Calcul_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcul_buttonActionPerformed(evt);
            }
        });

        DeleteMain_Button.setText("удалить");
        DeleteMain_Button.setToolTipText("удаляет выбранную строку");
        DeleteMain_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMain_ButtonActionPerformed(evt);
            }
        });

        SaveConteiner_Button.setText("записать в контейнер");
        SaveConteiner_Button.setToolTipText("помещает выбранную строку в контейнер");
        SaveConteiner_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveConteiner_ButtonActionPerformed(evt);
            }
        });

        DeleteMain_Button1.setText("очистить");
        DeleteMain_Button1.setToolTipText("удаляет выбранную строку");
        DeleteMain_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMain_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteMain_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteMain_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveConteiner_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calcul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveConteiner_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteMain_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteMain_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CalTable.setViewportView(jPanel1);

        ActionMenu.addTab("главная", CalTable);

        SaveTable.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Return_Button.setText("вернуть");
        Return_Button.setToolTipText("записывает выбранное значение в основную таблицу");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });

        DeteleCont_button.setText("удалить");
        DeteleCont_button.setToolTipText("удаляет выбранное значение из контейнера");
        DeteleCont_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeteleCont_buttonActionPerformed(evt);
            }
        });

        CleanCont_Button.setText("очистить");
        CleanCont_Button.setToolTipText("очищает контейнер");
        CleanCont_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanCont_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeteleCont_button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CleanCont_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Return_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeteleCont_button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CleanCont_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaveTable.setViewportView(jPanel2);

        ActionMenu.addTab("контейнер", SaveTable);

        jMenu1.setText("Файл");

        jMenu2.setText("Сохранение");

        jMenuItem1.setText("текстовой вид");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("двоичный вид");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenu3.setText("Загрузка");

        jMenuItem3.setText("текстовой вид");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("двоичный вид");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DBtext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UBtext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Stext, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lower_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(upper_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(step_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MainTable, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Stext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UBtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DBtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(step_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lower_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upper_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainTable, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lower_bound_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lower_bound_entActionPerformed

    }//GEN-LAST:event_lower_bound_entActionPerformed

    public class RecIntegral
    {
        public double Lower_bound;
        public double Upper_bound;
        public double Step;
        public double Result;
        
        public RecIntegral()
        {
            Lower_bound = 0;
            Upper_bound = 0;
            Step = 0;
            Result = 0;
        }
        public RecIntegral(double Lower_bound, double Upper_bound, double Step, double Result)throws RecIntegralExcept
        {
            this.Lower_bound = Lower_bound;
            this.Upper_bound = Upper_bound;
            this.Step = Step;
            this.Result = Result;
        }
        public void SetData(double Lower_bound, double Upper_bound, double Step, double Result)
        {
            this.Lower_bound = Lower_bound;
            this.Upper_bound = Upper_bound;
            this.Step = Step;
            this.Result = Result;
        }
    }
    class RecIntegralExcept extends Exception
    {
        private int Number;
        public int getNumber(){return Number;}
        public RecIntegralExcept(String message, int Number)
        {
            super(message);
            this.Number = Number;
        }
    }
    
    public class ThreadCalculateClass extends Thread
    {
        private double Upper_bound, Lower_bound, Step;
        double Res = 0;
        
        public ThreadCalculateClass(double Upper_bound, double Lower_bound, double Step)
        {
            this.Upper_bound = Upper_bound;
            this.Lower_bound = Lower_bound;
            this.Step = Step;
        }
        public void run()
        {
            for (double i = Lower_bound; i < Upper_bound; i=i+Step)
            {
              if(i+Step > Upper_bound)
              {
                Step = Upper_bound-i;
              }
              Res += Step * (Math.tan(i) + Math.tan(i+Step)) / 2;
            }
        }
        public double GetResult(){return Res;}
        
    }
    LinkedList<RecIntegral> ConteinerData = new LinkedList<>();
    
    public double calculate(double Upper_bound, double Lower_bound, double Step)
    {
        double Res = 0;
        for (double i = Lower_bound; i < Upper_bound; i=i+Step)
        {
            if(i+Step > Upper_bound)
            {
                Step = Upper_bound-i;
            }
            Res += Step * (Math.tan(i) + Math.tan(i+Step)) / 2;
        }
        return Res;
    }
    public double MutliThreadCalculate(double Upper_bound, double Lower_bound, double Step, int ThreadCount)
    {
        
        double Res = 0;
        ThreadCalculateClass[] threads = new ThreadCalculateClass[ThreadCount];
        double step = (Upper_bound - Lower_bound)/ ThreadCount;
        double b = 3;

        // Создание и запуск потоков
        for (int i = 0; i < ThreadCount; i++) 
        {
            double lowerBound = i * step;
            double upper = Math.min((i + 1) * step, Upper_bound);
            b = upper;
            threads[i] = new ThreadCalculateClass(upper, lowerBound,Step);
            threads[i].start();
        }

        // Ожидание завершения всех потоков
        try
        {
            for (ThreadCalculateClass thread : threads) {
                thread.join();
                Res += thread.GetResult();
            }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка при сохранении (" + e.getMessage() + ")");
        }
                
        return Res;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    //ВЫЧИСЛЕНИЕ
    private void Calcul_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcul_buttonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        int selectedRow = CurTable.getSelectedRow();
        double Lower_bound = 0, Upper_bound = 0,Step = 0, Res = 0;
        if(selectedRow!=-1)
        {
           Lower_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 0).toString());
           Upper_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 1).toString());
           Step = Double.parseDouble(myTable.getValueAt(selectedRow, 2).toString());
        }
        int Tcount = (int)(Upper_bound - Lower_bound) /  4;
        Res = MutliThreadCalculate(Upper_bound, Lower_bound, Step,4);
        
        myTable.setValueAt(Res, selectedRow, 3);
    }//GEN-LAST:event_Calcul_buttonActionPerformed
    //ДОБАВЛЕНИЕ
    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        myTable.insertRow(0, new Object[]{
            lower_bound_ent.getText(),
            upper_bound_ent.getText(),
            step_ent.getText(),
        });
        double Lower_bound = 0, Upper_bound = 0,Step = 0, Res = 0;
           Lower_bound = Double.parseDouble(myTable.getValueAt(0, 0).toString());
           Upper_bound = Double.parseDouble(myTable.getValueAt(0, 1).toString());
           Step = Double.parseDouble(myTable.getValueAt(0, 2).toString());
        Res = calculate(Upper_bound, Lower_bound, Step);
        myTable.setValueAt(Res, 0, 3);
    }//GEN-LAST:event_Add_buttonActionPerformed
    //УДАЛЕНИЕ
    private void DeleteMain_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMain_ButtonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        int selectedRow = CurTable.getSelectedRow();
        if(selectedRow!=-1)
        {
        myTable.removeRow(selectedRow);
        }

    }//GEN-LAST:event_DeleteMain_ButtonActionPerformed
    
    private void upper_bound_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upper_bound_entActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upper_bound_entActionPerformed
    //ДОБАВЛЕНИЕ В КОНТЕЙНЕР
    private void SaveConteiner_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveConteiner_ButtonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        int selectedRow = CurTable.getSelectedRow();
        if(selectedRow!=-1)
        {
           double Lower_bound = 0, Upper_bound = 0,Step = 0, Res = 0;
           Lower_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 0).toString());
           Upper_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 1).toString());
           Step = Double.parseDouble(myTable.getValueAt(selectedRow, 2).toString());
           Res = Double.parseDouble(myTable.getValueAt(selectedRow, 3).toString());
           try
           {
               if(Lower_bound > 100 || Upper_bound > 100 || Step > 100) throw new RecIntegralExcept("Одно из введённых занчений больше 100",1);
               if(Lower_bound < 0.0001 || Upper_bound < 0.0001 || Step < 0.0001) throw new RecIntegralExcept("Одно из введённых занчений меньше 0.0001",1);
               if(Lower_bound >= Upper_bound) throw new RecIntegralExcept("неверно введены пороги",2);
               if((Upper_bound - Lower_bound) < Step) throw new RecIntegralExcept("неверно введён шаг",3);
               ConteinerData.add(new RecIntegral(Lower_bound,Upper_bound,Step,Res));
               RecIntegral ConData = ConteinerData.getLast();
               DefaultTableModel ConteinerTable =(DefaultTableModel)ConTable.getModel();
               ConteinerTable.insertRow(ConteinerTable.getRowCount(), new Object[]{
               ConData.Lower_bound,
               ConData.Upper_bound,
               ConData.Step,
               ConData.Result,
               });
           } catch(RecIntegralExcept e)
           {
               JOptionPane.showMessageDialog(null, e.getMessage());
           }
        }
    }//GEN-LAST:event_SaveConteiner_ButtonActionPerformed
    //ВОЗВРАТ ИЗ КОНТЕЙНЕРА
    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        DefaultTableModel ConteinerTable =(DefaultTableModel)ConTable.getModel();
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        int selectedRow = ConTable.getSelectedRow();
           //RecIntegral ConData = ConteinerData.get(selectedRow);
        for(int i = 0; i < ConteinerData.size();i++ )
        {
           RecIntegral ConData = ConteinerData.get(i);
           myTable.insertRow(0, new Object[]{
           ConData.Lower_bound,
           ConData.Upper_bound,
           ConData.Step,
           ConData.Result,
           });
        }
    }//GEN-LAST:event_Return_ButtonActionPerformed
    //УДАЛЕНИЕ ИЗ КОНТЕЙНЕРА
    private void DeteleCont_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeteleCont_buttonActionPerformed
        DefaultTableModel ConteinerTable =(DefaultTableModel)ConTable.getModel();
        int selectedRow = ConTable.getSelectedRow();
        if(selectedRow!=-1)
        {
            ConteinerData.remove(selectedRow);
            ConteinerTable.removeRow(selectedRow);
        }
    }//GEN-LAST:event_DeteleCont_buttonActionPerformed
    //ОЧИСТКА КОНТЕЙНЕРА
    private void CleanCont_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanCont_ButtonActionPerformed
        ConteinerData.clear();
        DefaultTableModel ConteinerTable =(DefaultTableModel)ConTable.getModel();
        ConteinerTable.setRowCount(0);
    }//GEN-LAST:event_CleanCont_ButtonActionPerformed
    //СОХРАНЕНИЕ ТЕКСТ
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try
        {
            DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
            int countRow = myTable.getRowCount();
            int countColum = myTable.getColumnCount();
            if (countRow > 0)
            {
               FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt", "text");
               jFileChooser1.setFileFilter(filter);
               jFileChooser1.showSaveDialog(DBtext);
               FileWriter fileWriter = new FileWriter(jFileChooser1.getSelectedFile() + ".txt");
               for(int i = 0; i < countRow; i++)
               {
                    for(int j = 0; j < countColum; j++)
                    {
                        fileWriter.write(myTable.getValueAt(i, j).toString() + "\n");
                    }
                }
                fileWriter.close();
                JOptionPane.showMessageDialog(null, "Успешно сохраненно");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Нельзя сохранить пустую таблицу");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка при сохранении (" + e.getMessage() + ")");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //СОХРАНЕНИЕ ДВОИЧНЫЙ
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try
        {
            DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
            if(myTable.getColumnCount()> 0)
            {
                jFileChooser1.showSaveDialog(DBtext);
                FileOutputStream FOS = new FileOutputStream(jFileChooser1.getSelectedFile() + ".ser");
                ObjectOutputStream OOS = new ObjectOutputStream(FOS);
                int count = myTable.getRowCount();
                OOS.writeObject(count);
                for(int i = 0; i < count; i++)
                {
                    OOS.writeObject(new RecIntegral(
                                            Double.parseDouble(myTable.getValueAt(i, 0).toString()),
                                            Double.parseDouble(myTable.getValueAt(i, 1).toString()),
                                            Double.parseDouble(myTable.getValueAt(i, 2).toString()),
                                            Double.parseDouble(myTable.getValueAt(i, 3).toString())
                    ));
                }
                OOS.close();
                JOptionPane.showMessageDialog(null, "Успешно сохраненно");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Нельзя сохранить пустую таблицу");
            }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка при сохранении (" + e.getMessage() + ")");
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed
    //ЗАГРУЗКА ТЕКСТ
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                try
        {
            DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt", "text");
            jFileChooser1.setFileFilter(filter);
            jFileChooser1.showOpenDialog(DBtext);
            FileReader fileReader = new FileReader(jFileChooser1.getSelectedFile());
            Scanner scan = new Scanner(fileReader);
            
            myTable.setRowCount(0);
            while (scan.hasNextLine()) 
            {
                myTable.insertRow(myTable.getRowCount(), new Object[]
                {
                   scan.nextLine(),
                   scan.nextLine(),
                   scan.nextLine(),
                   scan.nextLine(),
                });
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка при загрузке (" + e.getMessage() + ")");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    //ЗАГРУЗКА ДВОИЧНЫЙ
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try
        {
            DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("ser", "ser", "ser");
            jFileChooser1.setFileFilter(filter);
            jFileChooser1.showOpenDialog(DBtext);
            
            FileInputStream FIS = new FileInputStream(jFileChooser1.getSelectedFile());
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            
            int count = (int)OIS.readObject();
            myTable.setRowCount(0);
            for(int i = 0; i < count; i ++)
            {
                RecIntegral buf = (RecIntegral)OIS.readObject();
                myTable.insertRow(myTable.getRowCount(), new Object[]
                {
                   buf.Lower_bound,
                   buf.Upper_bound,
                   buf.Step,
                   buf.Result
                });
            }
            
            OIS.close();
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ошибка при загрузке (" + e.getMessage() + ")");
        }

    }//GEN-LAST:event_jMenuItem4ActionPerformed
    //ОЧИСТКА ОСНОВНОЙ ТАБЛИЦЫ
    private void DeleteMain_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMain_Button1ActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)CurTable.getModel();
        myTable.setRowCount(0);

    }//GEN-LAST:event_DeleteMain_Button1ActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        try
        {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e)
        {
            
        }
        //</editor-fold>
        Collection<String> a;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ActionMenu;
    private javax.swing.JButton Add_button;
    private javax.swing.JScrollPane CalTable;
    private javax.swing.JButton Calcul_button;
    private javax.swing.JButton CleanCont_Button;
    private javax.swing.JTable ConTable;
    private javax.swing.JScrollPane ConteinerTable;
    private javax.swing.JTable CurTable;
    private javax.swing.JScrollPane CurrentTable;
    private javax.swing.JLabel DBtext;
    private javax.swing.JButton DeleteMain_Button;
    private javax.swing.JButton DeleteMain_Button1;
    private javax.swing.JButton DeteleCont_button;
    private javax.swing.JLabel Logo;
    private javax.swing.JTabbedPane MainTable;
    private javax.swing.JButton Return_Button;
    private javax.swing.JButton SaveConteiner_Button;
    private javax.swing.JScrollPane SaveTable;
    private javax.swing.JLabel Stext;
    private javax.swing.JLabel UBtext;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lower_bound_ent;
    private javax.swing.JTextField step_ent;
    private javax.swing.JTextField upper_bound_ent;
    // End of variables declaration//GEN-END:variables
}
