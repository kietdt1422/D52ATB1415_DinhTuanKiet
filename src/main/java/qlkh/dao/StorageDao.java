package qlkh.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import qlkh.entity.Storage;
import qlkh.entity.StorageXML;

import qlkh.utils.FileUtils;


public class StorageDao {
    private static final String STORAGE_FILE_NAME = "storage.xml";
    private List<Storage> listStorage;

    public StorageDao() {
        this.listStorage = readListStorage();
        if (listStorage == null) {
            listStorage = new ArrayList<Storage>();
        }
    }

    public boolean findSubstrings(String arr, String substring) {
        if (arr.contains(substring)) return true;
                else return false;
    }
    
    public ArrayList<Storage> searchStorage(String searchItem, String category){
        boolean isFound = false;
        ArrayList<Storage> foundFilm = new ArrayList<>();
        Storage found = null;
        int size = listStorage.size();
        switch(category){
            case "Mã hàng":
                for(int i = 0; i < size ; i++){
                    int Id = listStorage.get(i).getId();
                    if (findSubstrings(Integer.toString(Id),searchItem)) {
                        found = listStorage.get(i);
                        foundFilm.add(found);
                        isFound = true;
                    }
                }
                 break;
       
            case "Tên hàng":
                for(int i = 0; i < size ; i++){
                    String Name = listStorage.get(i).getName();
                    if (findSubstrings(Name,searchItem)) {
                        found = listStorage.get(i);
                        foundFilm.add(found);
                        isFound = true;
                    }
                }
                break;
            case "Giá":
                for(int i = 0; i < size ; i++){
                    int price = listStorage.get(i).getPrice();
                    if (findSubstrings(Integer.toString(price),searchItem)) {
                        found = listStorage.get(i);
                        foundFilm.add(found);
                        isFound = true;
                    }
                }
                break;
            case "Đơn vị":
                for(int i = 0; i < size ; i++){
                    String Unit = listStorage.get(i).getUnit();
                    if (findSubstrings(Unit,searchItem)) {
                        found = listStorage.get(i);
                        foundFilm.add(found);
                        isFound = true;
                    }
                }
                break;
            case "":
                for(int i = 0; i < size ; i++){
                    String Name = listStorage.get(i).getName();
                    if (findSubstrings(Name,searchItem)) {
                        found = listStorage.get(i);
                        foundFilm.add(found);
                        isFound = true;
                    }
                }
                break;
                 
        }
        if(isFound){
            return foundFilm;
        }else{
            return null;
                }
    }
    
    
    public void writeListStorage(List<Storage> storage) {
        StorageXML storageXML = new StorageXML();
        storageXML.setStorage(storage);
        FileUtils.writeXMLtoFile(STORAGE_FILE_NAME, storageXML);
    }

    /**
     * Đọc các đối tượng student từ file student.xml
     * 
     * @return list student
     */
    public List<Storage> readListStorage() {
        List<Storage> list = new ArrayList<Storage>();
        StorageXML storageXML = (StorageXML) FileUtils.readXMLFile(
                STORAGE_FILE_NAME, StorageXML.class);
        if (storageXML != null) {
            list = storageXML.getStorage();
        }
        return list;
    }
    

    
    public void add(Storage storage) {
        int id = 1;
        if (listStorage != null && listStorage.size() > 0) {
            id = listStorage.size() + 1;
        }
        storage.setId(id);
        listStorage.add(storage);
        writeListStorage(listStorage);
    }

    
    public void edit(Storage storage) {
        int size = listStorage.size();
        for (int i = 0; i < size; i++) {
            if (listStorage.get(i).getId() == storage.getId()) {
                listStorage.get(i).setName(storage.getName());
                listStorage.get(i).setUnit(storage.getUnit());
                listStorage.get(i).setQuantity(storage.getQuantity());
                listStorage.get(i).setPrice(storage.getPrice());
                writeListStorage(listStorage);
                break;
            }
        }
    }

   
    public boolean delete(Storage storage) {
        boolean isFound = false;
        int size = listStorage.size();
        for (int i = 0; i < size; i++) {
            if (listStorage.get(i).getId() == storage.getId()) {
                storage = listStorage.get(i);
                isFound = true;
                break;
            }
        }
        if (isFound) {
            listStorage.remove(storage);
            writeListStorage(listStorage);
            return true;
        }
        return false;
    }

    
    public void sortStorageByName() {
        Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage storage1, Storage storage2) {
                return storage1.getName().compareTo(storage2.getName());
            }
        });
    }

    
    public void sortStorageByPrice() {
        Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage st1, Storage st2) {
                if (st1.getPrice() > st2.getPrice()) {
                    return 1;
                }
                return -1;
            }
        });
    }
    
    public void sortStorageById() {
        Collections.sort(listStorage, new Comparator<Storage>() {
            public int compare(Storage st1, Storage st2) {
                if (st1.getId() > st2.getId()) {
                    return 1;
                }
                return -1;
            }
        });
    }

    public List<Storage> getlistStorage() {
        return listStorage;
    }

    public void setlistStorage(List<Storage> listStorage) {
        this.listStorage = listStorage;
    }
}