
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class VendasView extends JFrame {

    private JTable tabelaVendas;
    private DefaultTableModel model;

    public VendasView(ArrayList<ProdutosDTO> produtosVendidos) {
        setTitle("Tela de Vendas");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tabelaVendas = new JTable();
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nome");
        model.addColumn("Valor");
        model.addColumn("Status");
        tabelaVendas.setModel(model);

        for (ProdutosDTO produto : produtosVendidos) {
            model.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getValor(), produto.getStatus()});
        }

        JScrollPane scrollPane = new JScrollPane(tabelaVendas);
        add(scrollPane);
        
        

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {

        VendasView vendasView = new VendasView();

        vendasView.setVisible(true);

        dispose();
    }

}
