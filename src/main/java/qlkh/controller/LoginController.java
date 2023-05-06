package qlkh.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import qlkh.dao.UserDao;
import qlkh.entity.User;
import qlkh.view.ChartView;
import qlkh.view.EditView;
import qlkh.view.LoginView;
import qlkh.view.StorageView;

public class LoginController {
    private UserDao userDao;
    private LoginView loginView;
    private StorageView storageView;
    private EditView editView;
    private ChartView chartView;
    
    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }
    
    public void showLoginView() {
        loginView.setVisible(true);
    }
    
    
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
                // nếu đăng nhập thành công, mở màn hình quản lý sinh viên
                storageView = new StorageView();
                editView = new EditView();
                chartView = new ChartView();
                StorageController storageController = new StorageController(storageView, editView, chartView);
                storageController.showStorageView();
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }
}
