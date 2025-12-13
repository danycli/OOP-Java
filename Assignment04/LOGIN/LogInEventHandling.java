package Assignment04.LOGIN;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import Assignment04.DASHBOARD.Dashboard;

public class LogInEventHandling extends MouseAdapter{
    private LogIn login;

    public LogInEventHandling(LogIn L){
        login = L;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource() == login.getLoginButton()){
            loginButtonHandle();
        }else if(e.getSource() == login.getForgotPass()){
            forgotPassword();
        }else if(e.getSource() == login.getUserField()){
            login.getUserField().setText("");
        }else if(e.getSource() == login.getPassField()){
            login.setpassField("");
        }
    }

    private void forgotPassword() {
        JOptionPane.showMessageDialog(login, "I am not going to help you with this","Forgot Password",JOptionPane.PLAIN_MESSAGE);
    }

    private void loginButtonHandle(){
        if(login.getpassFieldText().equals(login.getPass()) && login.getUserFieldText().equals(login.getUserName())){
                login.dispose();
                Dashboard dashboard = new Dashboard();
                dashboard.display();
            }else if(!(login.getpassFieldText().equals(login.getPass()) && login.getUserFieldText().equals(login.getUserName()))){
                login.showError("One or both Credentials are incorrect!");
            }else{
                login.showError("An Unknown Error has been occur");
            }
    }
}
