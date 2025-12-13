package Assignment04.LOGIN;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Assignment04.DASHBOARD.Dashboard;

public class LogInEventHandling extends MouseAdapter{
    LogIn login;

    public LogInEventHandling(LogIn L){
        login = L;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(e.getSource() == login.getLoginButton()){
            loginButtonHandle();
        }else if(e.getSource() == login.getForgotPass()){

        }else if(e.getSource() == login.getForgotPass()){

        }else if(e.getSource() == login.getUserField()){
            login.getUserField().setText("");
        }else if(e.getSource() == login.getPassField()){
            login.setpassField("");
        }
    }

    private void loginButtonHandle(){
        if(login.getpassFieldText().equals(login.getPass()) && login.getUserFieldText().equals(login.getUserName())){
                login.dispose();
                Dashboard dashboard = new Dashboard();
                dashboard.display();
            }else{
                
            }
    }
}
