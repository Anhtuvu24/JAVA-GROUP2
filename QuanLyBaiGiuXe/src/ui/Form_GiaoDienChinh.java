package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Form_GiaoDienChinh extends JFrame implements MouseListener, ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JPanel pnCneter;
    JMenu mnTrangChu, mnThoat, mnNhanXe, mnTraXe, mnDangKy, mnKhuVuc, mnThongKe;
    JMenuItem mnThongKeLuotGui,mnThongKeLuotDangKy;
    public Form_GiaoDienChinh(){
        doShow();
    }
    public void doShow(){
        setSize(1400,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Quan ly bai xe");

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        Font ftmn = new Font("arial",Font.BOLD,16);
        JMenuBar menuBar = new JMenuBar();

        mnTrangChu = new JMenu("Trang chu");
        mnTrangChu.setFont(ftmn);
        mnTrangChu.isSelected();


        mnNhanXe = new JMenu("Nhan xe");
        mnNhanXe.setFont(ftmn);


        mnTraXe = new JMenu("Tra xe");
        mnTraXe.setFont(ftmn);


        mnDangKy = new JMenu("Dang ky ve thang");
        mnDangKy.setFont(ftmn);


        mnKhuVuc = new JMenu("Khu vuc");
        mnKhuVuc.setFont(ftmn);


        mnThongKe = new JMenu("Thong ke");
        mnThongKe.setFont(ftmn);
        mnThongKe.add(mnThongKeLuotGui = new JMenuItem("Thong ke luot gui xe"));
        mnThongKe.add(mnThongKeLuotDangKy = new JMenuItem("Thong ke luot dang ky ve thang"));
        mnThongKeLuotGui.setPreferredSize(new Dimension(200,30));
        mnThongKeLuotDangKy.setPreferredSize(new Dimension(200,30));

        mnThoat = new JMenu("Thoat");
        mnThoat.setFont(ftmn);

        JMenu menu = new JMenu("                                                                    " +
                "                                                       ");
        menu.setEnabled(true);

        menuBar.add(mnTrangChu);
        menuBar.add(mnNhanXe);
        menuBar.add(mnTraXe);
        menuBar.add(mnDangKy);
        menuBar.add(mnKhuVuc);
        menuBar.add(mnThongKe);
        menuBar.add(menu);
        menuBar.add(mnThoat);
        mnThoat.setMargin(new Insets(0,300, 0,0));


        //PnCneter
        pnCneter = new JPanel();
        JPanel pnCenterN = new JPanel();
        JPanel pnCenterC = new JPanel();
        pnCneter.setLayout(new BorderLayout());
        JLabel lblTieuDe = new JLabel("Quan ly gui xe");
        lblTieuDe.setFont(new Font("arial",Font.BOLD,24));
        lblTieuDe.setForeground(Color.RED);
        pnCenterN.setPreferredSize(new Dimension(1000,80));

        JLabel lbImage = new JLabel();

        pnCenterN.add(lblTieuDe);
        pnCenterC.add(lbImage);
        pnCneter.add(pnCenterN,BorderLayout.NORTH);
        pnCneter.add(pnCenterC,BorderLayout.CENTER);

        //pnSouth
        JPanel pnSouth = new JPanel();

        cp.add(menuBar,BorderLayout.NORTH);
        cp.add(pnCneter,BorderLayout.CENTER);
        cp.add(pnSouth,BorderLayout.SOUTH);
        menuBar.setBackground(Color.decode("#8ed1fc"));
        pnCneter.setForeground(Color.decode("#CCCCCC"));

        //Event
        mnTrangChu.addMouseListener(this);
        mnThoat.addMouseListener(this);
        mnNhanXe.addMouseListener(this);
        mnTraXe.addMouseListener(this);
        mnDangKy.addMouseListener(this);
        mnKhuVuc.addMouseListener(this);
        mnThongKe.addMouseListener(this);

        mnThongKeLuotGui.addActionListener(this);
        mnThongKeLuotDangKy.addActionListener(this);

    }

    public static void main(String[] args) {
        new Form_GiaoDienChinh().setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(mnTrangChu)) {
            System.out.println("Menu Trang Chu Selected!");
            Form_TrangChu form_trangChu = new Form_TrangChu();
            pnCneter.removeAll();
            pnCneter.add(form_trangChu);
            validate();
        } else if(e.getSource().equals(mnThoat)) {
            System.out.println("Menu Thoat Selected!");
            setVisible(false);
            dispose();
            System.out.println("Exit Program!");
        } else if(e.getSource().equals(mnNhanXe)) {
            System.out.println("Menu Nhan Xe Selected!");
            Form_NhanXe form_nhanXe = new Form_NhanXe();
            pnCneter.removeAll();
            pnCneter.add(form_nhanXe);
            validate();
        } else if(e.getSource().equals(mnTraXe)) {
            System.out.println("Menu Tra Xe Selected!");
            Form_TraXe form_traXe = new Form_TraXe();
            pnCneter.removeAll();
            pnCneter.add(form_traXe);
            validate();
        } else if(e.getSource().equals(mnDangKy)) {
            System.out.println("Menu Dang Ky Ve Thang Selected!");
            Form_DangKyVeThang form_dangKyVeThang = new Form_DangKyVeThang();
            pnCneter.removeAll();
            pnCneter.add(form_dangKyVeThang);
            validate();
        } else if(e.getSource().equals(mnKhuVuc)) {
            System.out.println("Menu Khu Vuc Selected!");
            Form_KhuVuc form_khuVuc = new Form_KhuVuc();
            pnCneter.removeAll();
            pnCneter.add(form_khuVuc);
            validate();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mnThongKeLuotGui)) {
            System.out.println("Menu Thong Ke Luot Gui Xe Selected!");
            Form_ThongKeLuotGui form_thongKeLuotGui = new Form_ThongKeLuotGui();
            pnCneter.removeAll();
            pnCneter.add(form_thongKeLuotGui);
            validate();
        } else if (e.getSource().equals(mnThongKeLuotDangKy)) {
            System.out.println("Menu Thong Ke Luot Dang Ky Selected!");
            Form_ThongKeLuotDangKy form_thongKeLuotDangKy = new Form_ThongKeLuotDangKy();
            pnCneter.removeAll();
            pnCneter.add(form_thongKeLuotDangKy);
            validate();
        }
    }
}
