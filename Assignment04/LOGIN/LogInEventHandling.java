package Assignment04.LOGIN;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Assignment04.DASHBOARD.Dashboard;

public class LogInEventHandling extends MouseAdapter{
    private LogIn login;
    private ForgotFrame forgotframe;
    private ResetPass reset;

    public LogInEventHandling(LogIn L){
        login = L;
    }
    public LogInEventHandling(ForgotFrame f){
        forgotframe = f;
    }
    public LogInEventHandling(ResetPass r){
        reset = r;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        if(login != null && e.getSource() == login.getLoginButton()){
            loginButtonHandle();
        }else if(login != null && e.getSource() == login.getForgotPass()){
            ForgotFrame forgot = new ForgotFrame();
            forgot.display();
            login.dispose();
        }else if(forgotframe != null && e.getSource() == forgotframe.getBack()){
            LogIn Login = new LogIn();
            Login.display();
            forgotframe.dispose();
        }else if(forgotframe != null && e.getSource() == forgotframe.getNext()){
            if(forgotframe.getName().toLowerCase().equals("cristiano ronaldo dos santos aveiro")){
                ResetPass resetting = new ResetPass();
                resetting.display();
                forgotframe.dispose();
            }
        }else if(reset != null && e.getSource() == reset.getReset() && reset.getPassText() != null && reset.getUserText() != null){
                LogIn newLogin = new LogIn();
                newLogin.setPass(reset.getPassText());
                newLogin.setUserName(reset.getUserText());
                newLogin.display();
                reset.dispose();
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
            }else if(!(login.getpassFieldText().equals(login.getPass()) && login.getUserFieldText().equals(login.getUserName()))){
                login.showError("One or both Credentials are incorrect!");
            }else{
                login.showError("An Unknown Error has been occur");
            }
    }
}
