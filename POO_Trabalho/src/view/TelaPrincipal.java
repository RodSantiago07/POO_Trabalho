package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class TelaPrincipal extends JFrame{
    
    private static final long serialVersionUID = 1L;
	private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal janelaPrincipal = new TelaPrincipal();
					janelaPrincipal.setVisible(true);
					janelaPrincipal.setTitle("Tela principal");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});       
    }
    
    
    public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// barra do menu
		JMenuBar menuBar = new JMenuBar();
		// Menu Novo
		JMenu menuNovo = new JMenu("Novo");
		// Menu Consultar
		JMenu menuConsultar = new JMenu("Consultar");

		// item do menu Novo
		JMenuItem menuNovoCotacao = new JMenuItem("Cotação");
		menuNovoCotacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// item do menu Novo
		JMenuItem menuNovoFornecedor = new JMenuItem("Fornecedor");
		menuNovoFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// item do menu Novo
		JMenuItem menuNovoProposta = new JMenuItem("Proposta");
		menuNovoProposta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// item do menu Novo
		JMenuItem menuNovoExit = new JMenuItem("Exit");
		menuNovoExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("fechando");
				System.exit(0);
			}
		});

		// item do menu Consultar
		JMenuItem menuConsultarCotacoes = new JMenuItem("Cotações");
		menuConsultarCotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// item do menu Consultar
		JMenuItem menuConsultarFornecedores = new JMenuItem("Fornecedores");
		menuConsultarFornecedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		// item do menu Consultar
		JMenuItem menuConsultarCompras = new JMenuItem("Compras");
		menuConsultarCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		menuBar.add(menuNovo);
		menuNovo.add(menuNovoCotacao);
		menuNovo.add(menuNovoFornecedor);
		menuNovo.add(menuNovoProposta);
		menuNovo.add(menuNovoExit);

		menuBar.add(menuConsultar);
		menuConsultar.add(menuConsultarCotacoes);
		menuConsultar.add(menuConsultarFornecedores);
		menuConsultar.add(menuConsultarCompras);
		super.setJMenuBar(menuBar);
		
		
		// Botões 
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFornecedor.setBounds(99, 209, 109, 23);
		contentPane.add(btnFornecedor);

		JButton btnCotacao = new JButton("Cotacao");
		btnCotacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCotacao.setBounds(10, 209, 89, 23);
		contentPane.add(btnCotacao);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(335, 209, 89, 23);
		contentPane.add(btnSair);

		JButton btnCompras = new JButton("Compras");
		btnCompras.setBounds(209, 209, 89, 23);
		contentPane.add(btnCompras);
	}
    
}
