package qlkh.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import qlkh.dao.StorageDao;
import qlkh.entity.Storage;
import qlkh.utils.ExportarExcel;
import qlkh.view.ChartView;
import qlkh.view.EditView;
import qlkh.view.StorageView;

public class StorageController {
    private List<Storage> stList;
    private boolean check = false;
    private boolean checkAdd = false;
    private boolean checkEdit = false;
    private StorageDao storageDao;
    private StorageView storageView;
    private EditView editView;
    private ChartView chartView;
            
    public StorageController(StorageView view, EditView eview, ChartView cview) {
        this.storageView = view;
        this.editView = eview;
        this.chartView = cview;
        editView.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        storageDao = new StorageDao();
        storageView.setEditView(editView);
        view.addConfirmListener(new ConfrimListener());
        view.addAddListener(new AddListener());
        view.addEditListener(new EditListener());
        view.addDeleteListener(new DeleteListener());
        view.addClearListener(new ClearListener());
        view.addSortListener(new SortListener());
        view.addListSelectionListener(new listSelectionListener());
        view.addCancelListener(new CancelListenner());
        view.addSearchListener(new SearchListenner());
        view.addSearchCanceltener(new SCListenner());
        view.addToExcelListenner(new ToExcelListener());
        view.addChartListener(new ChartListener());
    }

    public void showStorageView() {
        storageDao.sortStorageById();
        stList = storageDao.getlistStorage();
        storageView.clearStorageInfo();
        storageView.clearSearch();
        storageView.setVisible(true);
        storageView.showListStorage(stList);
    }
    public void showEditView() {
        editView.setVisible(true);
        
    }

    class ToExcelListener implements ActionListener {   

        @Override
        public void actionPerformed(ActionEvent e) {
            storageDao.sortStorageById();
            stList = storageDao.getlistStorage();
            storageView.showListStorage(stList);
            ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(storageView.getTable());
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }     
        }
    }

    class SCListenner implements ActionListener {   

        @Override
        public void actionPerformed(ActionEvent e) {
            storageDao.sortStorageById();
            stList = storageDao.getlistStorage();
            storageView.clearStorageInfo();
            storageView.showListStorage(stList);
            storageView.EnabledFalse();
            storageView.clearSearch();
        }
    }
    
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            showEditView();
            storageView.clearStorageInfo();
            editView.callAdd();
            checkAdd = true;
//            Storage st = storageView.getStorageInfo();
//            if (st != null) {
//                storageDao.add(st);
//                storageView.showStorage(st);
//                storageView.showListStorage(storageDao.getlistStorage());
//                storageView.showMessage("Thêm thành công!");
//            }
        }
    }
    class CancelListenner implements ActionListener {

        public void actionPerformed(ActionEvent e) {
           editView.setVisible(false);
           checkAdd = false;
           checkEdit = false;
        }
        
    }
    
    class SearchListenner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            storageDao.sortStorageById();
            storageView.clearStorageInfo();
            String searchItem = storageView.getSearchItem();
            String category = storageView.getComboBoxSeachVal();
            stList = storageDao.searchStorage(searchItem, category);
            if (stList==null) {
                storageView.showMessage("Không tìm thấy hàng!");
                stList = (ArrayList<Storage>) storageDao.getlistStorage();
            }
            storageView.showListStorage(stList);
            storageView.EnabledFalse();
        }
        
    }
    
    
    
    class ConfrimListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Storage st;
            if(checkAdd){
                st = storageView.getStorageInfo(); 
                if (st != null) {
                    storageDao.add(st);
                    storageView.showStorage(st);
                    storageView.showListStorage(storageDao.getlistStorage());
                    storageView.showMessage("Thêm thành công!");
                    editView.setVisible(false);
                    checkAdd = false;
                }
                
            }
           if(checkEdit){
                    st = storageView.getStorageInfo();
                            if (st != null) {
                            storageView.showMessage("Cập nhật thành công!");
                            storageDao.edit(st);
                            storageView.showStorage(st);
                            storageView.showListStorage(storageDao.getlistStorage());
                            editView.setVisible(false);
                            checkEdit = false;         
                    }
                }          
           storageView.EnabledFalse();
           storageView.clearSearch();
        }
    }

   
    class EditListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            showEditView();
            checkEdit = true;
            editView.callEdit();
            storageView.EnabledFalse();
        }
    }

   
    class DeleteListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
//            if (student != null) {
//                studentDao.delete(student);
//                studentView.clearStudentInfo();
//                studentView.showListStudents(studentDao.getListStudents());
//                studentView.showMessage("Xóa thành công!");
//            }
            Storage st = storageView.getStorageInfo();
            if (st != null) {
                storageDao.delete(st);
                storageView.clearStorageInfo();
                storageView.showListStorage(storageDao.getlistStorage());
                storageView.showMessage("Cập nhật thành công!");
            }
            storageView.EnabledFalse();
        }
    }

    
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          
            if(checkAdd){
                storageView.clearStorageInfo();
                
            }
           if(checkEdit){
                   storageView.clearStorageInfoNotID();
                } 
           storageView.clearSearch();
        }
        
    }

   
    class SortListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sortStorage(stList,storageView.getComboBoxSeachVal());
            storageView.showListStorage(stList);
            storageView.EnabledFalse();
        }
    }
    
     public void sortStorage(List<Storage>listStorage, String category) {
         
        switch(category){
            case "Mã hàng":
                Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage st1, Storage st2) {
                if (st1.getId() > st2.getId()) {
                    return 1;
                }
                return -1;
            }
        });
                 break;
       
            case "Tên hàng":
                Collections.sort(listStorage, new Comparator<Storage>() {
                public int compare(Storage storage1, Storage storage2) {
                return storage1.getName().compareTo(storage2.getName());
                }
                });
                break;
            case "Giá":
                 Collections.sort(listStorage, new Comparator<Storage>() {
                 public int compare(Storage st1, Storage st2) {
                        if (st1.getPrice() > st2.getPrice()) {
                    return 1;
                }
                return -1;
                }
                 });

                break;
            case "Đơn vị":
                Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage storage1, Storage storage2) {
                return storage1.getUnit().compareTo(storage2.getUnit());
            }
                });
                
                break;
            case "":
                Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage st1, Storage st2) {
                if (st1.getId() > st2.getId()) {
                    return 1;
                }
                return -1;
            }
        });
                
                break;
       
    }
   
    }
    
    class listSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            storageView.EnabledTrue();
            storageView.fillStorageFromSelectedRow();
            editView.callEdit();
        }
    }
    class ChartListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            chartView = new ChartView();
            storageDao.sortStorageById();
            stList = storageDao.getlistStorage();
            storageView.showListStorage(stList);
            chartView.setChartQuantity(stList);
            chartView.setVisible(true);
            
        } 
        
    }
}
