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
            ForgotFrame Forgotframe = new ForgotFrame();
            Forgotframe.display();
            login.dispose();
        }else if(forgotframe != null && e.getSource() == forgotframe.getBack()){
            LogIn LOGIN = new LogIn("", "");
            LOGIN.display();
            forgotframe.dispose();
        }else if(forgotframe != null && e.getSource() == forgotframe.getNext()){
            if(forgotframe.getName().toLowerCase().equals("cristiano ronaldo dos santos aveiro")){
                ResetPass resets = new ResetPass();
                resets.display();
                forgotframe.dispose();
            }else{
                forgotframe.showError("Incorrect!");
            }
        }else if(reset != null && e.getSource() == reset.getReset() && reset.getPassText() != null && reset.getUserText() != null){
                login = new LogIn(reset.getUserText(),reset.getPassText());
                login.setPass(reset.getPassText());
                login.setUserName(reset.getUserText());
                login.display();
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
                Dashboard dashboard = new Dashboard(login.getUserFieldText(),login.getpassFieldText());
                dashboard.display();
            }else if(!(login.getpassFieldText().equals(login.getPass()) && login.getUserFieldText().equals(login.getUserName()))){
                login.showError("One or both Credentials are incorrect!");
            }else{
                login.showError("An Unknown Error has been occur");
            }
    }
}
