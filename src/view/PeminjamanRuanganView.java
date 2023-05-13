package view;
/*
KELOMPOK 3
Nama : Gabriel Allba Shemi Yuma
NPM : 210711150

Nama : Andreas Margono
NPM : 210711135
*/
import control.PeminjamanRuanganControl;
import exception.InputKosongException;
import exception.IdErrorException;
import exception.JenisErrorException;
import exception.NotNumberException;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Karyawan;
import table.TablePeminjamanRuangan;
import java.util.List;
import model.PeminjamanRuangan;
import model.Ruangan;
import control.KaryawanControl;
import control.RuanganControl;
import javax.swing.table.TableModel;


public class PeminjamanRuanganView extends javax.swing.JFrame {
    private PeminjamanRuanganControl peminjamanRuanganControl;
    private KaryawanControl karyawanControl;
    private RuanganControl ruanganControl;
    
    String action = null;
    int selectedId = 0;
    List<Karyawan> listKaryawan;
    List<Ruangan> listRuangan;
    
    public PeminjamanRuanganView() {
        peminjamanRuanganControl = new PeminjamanRuanganControl();
        karyawanControl = new KaryawanControl();
        ruanganControl = new RuanganControl();
        
        initComponents();
        setEditDeleteBtn(false);
        showPeminjaman();
        setKaryawanToDropdown();
        setRuanganToDropdown();
        setComponent(false);
    }
    
    public void setKaryawanToDropdown(){
        
        listKaryawan = karyawanControl.showListKaryawan();
        for(int i=0; i<listKaryawan.size(); i++){
            namaKaryawanInput.addItem(listKaryawan.get(i));
        }
    }
    
    public void setRuanganToDropdown(){
        listRuangan = ruanganControl.getAllRuangan("");
        for(int i=0; i<listRuangan.size(); i++){
            namaRuanganInput.addItem(listRuangan.get(i));
        }
    }
    
    // method untuk set komponen input dan button save, button cancel
    public void setComponent(boolean value){
        namaKaryawanInput.setEnabled(value);
        namaRuanganInput.setEnabled(value);
        tanggalInput.setEnabled(value);
        lamaPeminjamanInput.setEnabled(value);
        micCheck.setEnabled(value);
        proyektorCheck.setEnabled(value);
        dispenserCheck.setEnabled(value);
        
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    // method untuk set komponen button edit dan delete button
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    // method untuk set value text dari komponen input
    public void clearText(){
    
        namaKaryawanInput.setSelectedItem(ABORT);
        namaRuanganInput.setSelectedItem(ABORT);
        tanggalInput.setText("");
        lamaPeminjamanInput.setText("");
        searchInput.setText("");
        
        
    }
    public void showPeminjaman(){
        tablePeminjaman.setModel(peminjamanRuanganControl.showPeminjaman(""));
    }
    
    
    public void notNumberException() throws NotNumberException{
        throw new NotNumberException();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisButtonGroup = new javax.swing.ButtonGroup();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        SelectMenu = new javax.swing.JLabel();
        SelectMenu1 = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        isi = new javax.swing.JPanel();
        DataKaryawan = new javax.swing.JLabel();
        namaKaryawanLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        tanggalInput = new javax.swing.JTextField();
        lamaPeminjamanLabel = new javax.swing.JLabel();
        fasilitasLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        namaRuanganInput = new javax.swing.JComboBox<>();
        namaKaryawanInput = new javax.swing.JComboBox<>();
        micCheck = new javax.swing.JCheckBox();
        proyektorCheck = new javax.swing.JCheckBox();
        dispenserCheck = new javax.swing.JCheckBox();
        lamaPeminjamanInput = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        showDsn = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePeminjaman = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(109, 152, 134));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 62, 70));
        jLabel1.setText("OBJECT PERSISTENCE 2 ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 62, 70));
        jLabel2.setText("BY KELOMPOK 3:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 62, 70));
        jLabel3.setText("Andreas Margono   |   Gabriel Allba Shemi Yuma");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 62, 70));
        jLabel5.setText("210711135             210711150");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1))
                    .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(HeaderLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HeaderLayout.createSequentialGroup()
                            .addGap(328, 328, 328)
                            .addComponent(jLabel3)))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        Body.setBackground(new java.awt.Color(242, 231, 213));
        Body.setAutoscrolls(true);

        addBtn.setBackground(new java.awt.Color(153, 153, 153));
        addBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(153, 153, 153));
        editBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(153, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        SelectMenu.setBackground(new java.awt.Color(255, 255, 255));
        SelectMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SelectMenu.setForeground(new java.awt.Color(57, 62, 70));
        SelectMenu.setText("SELECT MENU");

        SelectMenu1.setBackground(new java.awt.Color(255, 255, 255));
        SelectMenu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SelectMenu1.setForeground(new java.awt.Color(57, 62, 70));
        SelectMenu1.setText("SEARCH DATA");

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(153, 153, 153));
        searchBtn.setForeground(new java.awt.Color(0, 0, 0));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        isi.setBackground(new java.awt.Color(159, 135, 114));
        isi.setForeground(new java.awt.Color(63, 78, 79));

        DataKaryawan.setBackground(new java.awt.Color(0, 51, 102));
        DataKaryawan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DataKaryawan.setForeground(new java.awt.Color(44, 54, 57));
        DataKaryawan.setText("DATA PEMINJAMAN");

        namaKaryawanLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaKaryawanLabel.setForeground(new java.awt.Color(44, 54, 57));
        namaKaryawanLabel.setText("Nama Karyawan");

        namaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namaLabel.setForeground(new java.awt.Color(44, 54, 57));
        namaLabel.setText("Nama Ruangan");

        tanggalLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(44, 54, 57));
        tanggalLabel.setText("Tanggal");

        lamaPeminjamanLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lamaPeminjamanLabel.setForeground(new java.awt.Color(44, 54, 57));
        lamaPeminjamanLabel.setText("Lama Peminjaman");

        fasilitasLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fasilitasLabel.setForeground(new java.awt.Color(44, 54, 57));
        fasilitasLabel.setText("Fasilitas");

        saveBtn.setBackground(new java.awt.Color(153, 153, 153));
        saveBtn.setForeground(new java.awt.Color(0, 0, 0));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(153, 153, 153));
        cancelBtn.setForeground(new java.awt.Color(0, 0, 0));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        micCheck.setForeground(new java.awt.Color(0, 0, 0));
        micCheck.setText("Mic");
        micCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micCheckActionPerformed(evt);
            }
        });

        proyektorCheck.setForeground(new java.awt.Color(0, 0, 0));
        proyektorCheck.setText("Proyektor");
        proyektorCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyektorCheckActionPerformed(evt);
            }
        });

        dispenserCheck.setForeground(new java.awt.Color(0, 0, 0));
        dispenserCheck.setText("Dispenser");
        dispenserCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispenserCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isiLayout = new javax.swing.GroupLayout(isi);
        isi.setLayout(isiLayout);
        isiLayout.setHorizontalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, isiLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(DataKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(195, 195, 195))
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tanggalInput)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(namaKaryawanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addComponent(namaRuanganInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaKaryawanInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(isiLayout.createSequentialGroup()
                                .addComponent(micCheck)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(isiLayout.createSequentialGroup()
                                .addComponent(lamaPeminjamanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(102, 102, 102))
                            .addGroup(isiLayout.createSequentialGroup()
                                .addComponent(fasilitasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(147, 147, 147))
                            .addGroup(isiLayout.createSequentialGroup()
                                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dispenserCheck)
                                    .addComponent(proyektorCheck)
                                    .addComponent(lamaPeminjamanInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        isiLayout.setVerticalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(DataKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKaryawanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lamaPeminjamanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKaryawanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamaPeminjamanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fasilitasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaRuanganInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(micCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proyektorCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(tanggalInput)
                        .addGap(48, 48, 48))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addComponent(dispenserCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(SelectMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52)))
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(SelectMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34))
                            .addGroup(BodyLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(searchInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn))))
                    .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelectMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelectMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput)
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28)
                .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        showDsn.setBackground(new java.awt.Color(237, 228, 224));
        showDsn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showDsn.setForeground(new java.awt.Color(57, 62, 70));
        showDsn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showDsn.setText("Show Peminjaman");

        tablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePeminjamanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePeminjaman);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("KARYAWAN");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/icons8-employee-100.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RUANGAN");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/icons8-room-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(showDsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showDsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        setComponent(true);
        setEditDeleteBtn(false);
        clearText();
        micCheck.setSelected(false);
        proyektorCheck.setSelected(false);
        dispenserCheck.setSelected(false);
        
        searchInput.setText("");
        action = "Tambah";
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
          if(namaKaryawanInput.getSelectedIndex()!=-1){
            setComponent(true);
            action = "Ubah";
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ? ", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                peminjamanRuanganControl.deleteDataPeminjaman(selectedId);
                clearText();
                showPeminjaman();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                setComponent(false);
                micCheck.setSelected(false);
                dispenserCheck.setSelected(false);
                proyektorCheck.setSelected(false);
            }catch(Exception e){
                System.out.println("Error : "+e.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
         setEditDeleteBtn(false);
        setComponent(false);
        
        try{
            TablePeminjamanRuangan peminjamanRuangan = peminjamanRuanganControl.showPeminjaman(searchInput.getText());
            if(peminjamanRuangan.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(rootPane, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                tablePeminjaman.setModel(peminjamanRuangan);
            }
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }//GEN-LAST:event_searchInputActionPerformed

 
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
            
            String metodePembelajaran="";
            String kelas = "";
            int selectedIndex = namaKaryawanInput.getSelectedIndex();
            int selectedIndexRuangan = namaRuanganInput.getSelectedIndex();
            
            Karyawan selectedKaryawan = listKaryawan.get(selectedIndex);
            Ruangan selectedRuangan = listRuangan.get(selectedIndexRuangan);
            
//            System.out.println(selectedKaryawan.getNama());
           
            String fasilitas = "";
            if(action.equals("Tambah")){
               
                if(micCheck.isSelected()){
                    fasilitas+="Mic ";
                }
                if(proyektorCheck.isSelected()){
                    fasilitas+="Proyektor ";
                }
                if(dispenserCheck.isSelected()){
                    fasilitas+="Dispenser ";
                }
                
                
//            public PeminjamanRuangan(int id, String tanggal, String lama_peminjaman, String fasilitas, Karyawan karyawan, Ruangan ruangan) 
                PeminjamanRuangan pr = new PeminjamanRuangan(0, tanggalInput.getText(), lamaPeminjamanInput.getText(), fasilitas, selectedKaryawan, selectedRuangan);
                peminjamanRuanganControl.insertPeminjaman(pr);
            }else{
                if(micCheck.isSelected()){
                    fasilitas+="Mic ";
                }
                if(proyektorCheck.isSelected()){
                    fasilitas+="Proyektor ";
                }
                if(dispenserCheck.isSelected()){
                    fasilitas+="Dispenser ";
                }
                PeminjamanRuangan pr = new PeminjamanRuangan(0, tanggalInput.getText(), lamaPeminjamanInput.getText(), fasilitas, selectedKaryawan, selectedRuangan);
                peminjamanRuanganControl.updatePeminjaman(pr, selectedId);
            }
            clearText();
            showPeminjaman();
            setComponent(false);
            micCheck.setSelected(false);
            proyektorCheck.setSelected(false);
            dispenserCheck.setSelected(false);
            setEditDeleteBtn(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(false);
        setComponent(false);
        
        try{
            TablePeminjamanRuangan peminjamanRuangan = peminjamanRuanganControl.showPeminjaman(searchInput.getText());
            if(peminjamanRuangan.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(rootPane, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                tablePeminjaman.setModel(peminjamanRuangan);
            }
        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        

    }//GEN-LAST:event_searchBtnActionPerformed

    private void micCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_micCheckActionPerformed

    private void proyektorCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyektorCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proyektorCheckActionPerformed

    private void dispenserCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispenserCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dispenserCheckActionPerformed

    private void tablePeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePeminjamanMouseClicked
        micCheck.setSelected(false);
        proyektorCheck.setSelected(false);
        dispenserCheck.setSelected(false);
        int indexKaryawan = -1;
        int indexRuangan = -1;
        setEditDeleteBtn(true);
        
        setComponent(false);
        
        
        int clickedRow = tablePeminjaman.getSelectedRow();
        TableModel tableModel = tablePeminjaman.getModel();
        
        
        tanggalInput.setText(tableModel.getValueAt(clickedRow, 3).toString());
        lamaPeminjamanInput.setText(tableModel.getValueAt(clickedRow, 4).toString());
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 8).toString());
        

        for(Karyawan karyawan : listKaryawan){
            if(karyawan.getNama().equals(tableModel.getValueAt(clickedRow, 0)) && karyawan.getJenis().equals(tableModel.getValueAt(clickedRow, 1)) 
            && karyawan.getBebanMengajar().equals(tableModel.getValueAt(clickedRow, 6)) && karyawan.getJamKerja() == (int)tableModel.getValueAt(clickedRow, 7)){
                indexKaryawan = listKaryawan.indexOf(karyawan);
            }
        }
        
        for(Ruangan ruangan : listRuangan){
            if(ruangan.getNama().equals(tableModel.getValueAt(clickedRow, 2))){
                indexRuangan = listRuangan.indexOf(ruangan);
            }
        }
//        
        namaRuanganInput.setSelectedIndex(indexRuangan);
        namaKaryawanInput.setSelectedIndex(indexKaryawan);
        
        String listFasilitas = (String)tableModel.getValueAt(clickedRow, 5);
        String real_list[] = listFasilitas.split(" ");
        for(String rl : real_list){
            if(rl.equals("Mic")){
                micCheck.setSelected(true);
            }
            
            if(rl.equals("Proyektor")){
                proyektorCheck.setSelected(true);
            }
            
            if(rl.equals("Dispenser")){
                dispenserCheck.setSelected(true);
            }
        }
//        
//        String namaKaryawan = tableModel.getValueAt(clickedRow, 0).toString();
//        switch(namaKaryawan){
//            case "3315":
//                radio3315.setSelected(true);
//                break;
//            case "3318":
//                radio3318.setSelected(true);
//                break;
//            case "3421":
//                radio3421.setSelected(true);
//                break;
//            case "3422":
//                radio3422.setSelected(true);
//                break;
//        }
//        
//        deskripsiInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        
        
        
        
    }//GEN-LAST:event_tablePeminjamanMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       KaryawanView kv = new KaryawanView();
        this.dispose();
        kv.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "DATA VIEW BELUM TERBENTUK :)", "Konfirmasi", JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_jPanel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanRuanganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel DataKaryawan;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel SelectMenu;
    private javax.swing.JLabel SelectMenu1;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JCheckBox dispenserCheck;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel fasilitasLabel;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup jenisButtonGroup;
    private javax.swing.JTextField lamaPeminjamanInput;
    private javax.swing.JLabel lamaPeminjamanLabel;
    private javax.swing.JCheckBox micCheck;
    private javax.swing.JComboBox<Karyawan> namaKaryawanInput;
    private javax.swing.JLabel namaKaryawanLabel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JComboBox<Ruangan> namaRuanganInput;
    private javax.swing.JCheckBox proyektorCheck;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel showDsn;
    private javax.swing.JTable tablePeminjaman;
    private javax.swing.JTextField tanggalInput;
    private javax.swing.JLabel tanggalLabel;
    // End of variables declaration//GEN-END:variables
}
