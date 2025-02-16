package tcc1;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JProgressBar;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

	public class TodoListIFSC extends JFrame {
	    private DefaultListModel<String> listModel;
	    private JList<String> taskList;
	    private JProgressBar progressBar;
	    private ArrayList<Boolean> taskCompletionStatus;
	    private int completedTasks = 0;

	    public TodoListIFSC() {
	        setTitle("Lista de Tarefas com ProgressBar");
	        setSize(400, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        getContentPane().setLayout(new BorderLayout());

	        listModel = new DefaultListModel<>();
	        taskList = new JList<>(listModel);
	        JScrollPane scrollPane = new JScrollPane(taskList);

	        progressBar = new JProgressBar(0, 100);
	        progressBar.setForeground(Color.GREEN);
	        progressBar.setBackground(Color.GREEN);
	        progressBar.setStringPainted(true);

	        taskCompletionStatus = new ArrayList<>();

	        JTextField taskField = new JTextField();
	        JButton addButton = new JButton("Adicionar");
	        JButton completeButton = new JButton("Concluir");

	        JPanel inputPanel = new JPanel(new BorderLayout());
	        inputPanel.add(taskField, BorderLayout.CENTER);
	        inputPanel.add(addButton, BorderLayout.EAST);

	        JPanel buttonPanel = new JPanel(new FlowLayout());
	        buttonPanel.add(completeButton);

	        getContentPane().add(scrollPane, BorderLayout.CENTER);
	        getContentPane().add(progressBar, BorderLayout.EAST);
	        getContentPane().add(inputPanel, BorderLayout.NORTH);
	        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

	        // Adicionar nova tarefa
	        addButton.addActionListener(e -> {
	            String task = taskField.getText().trim();
	            if (!task.isEmpty()) {
	                listModel.addElement(task);
	                taskCompletionStatus.add(false);
	                updateProgressBar();
	                taskField.setText("");
	            }
	        });

	        // Marcar como concluída
	        completeButton.addActionListener(e -> {
	            int selectedIndex = taskList.getSelectedIndex();
	            if (selectedIndex != -1 && !taskCompletionStatus.get(selectedIndex)) {
	                taskCompletionStatus.set(selectedIndex, true);
	                listModel.set(selectedIndex, "[✔] " + listModel.get(selectedIndex));
	                completedTasks++;
	                updateProgressBar();
	            }
	        });

	        setVisible(true);
	    }

	    public void updateProgressBar() {
	        int totalTasks = taskCompletionStatus.size();
	        int progress = (totalTasks == 0) ? 0 : (completedTasks * 100) / totalTasks;
	        progressBar.setValue(progress);
	    }
	    
	    

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(TodoListIFSC::new);
	        
	       
	    }
	}

