package com.example.bda2.Email;
/*
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.media.tv.TvInputService;
import android.os.AsyncTask;
import android.os.ConditionVariable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.bda2.R;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/*
public class JavaMailApi extends AsyncTask<Void,Void,Void> {

    private Context context;
   // private javax.mail.Session session;
    private String email,subject,message;

    public JavaMailApi(Context context, String email, String subject, String message) {
        this.context = context;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    ProgressDialog progressDialog;

    @Override
    protected void onPostExecute(Void unused) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Please wait as the email is being sent...");
        progressDialog.setTitle("Sending Email to the Donor");
        progressDialog.show();
        super.onPostExecute(unused);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port","465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.port","465");

        session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(Util.EMAIL,Util.PASSWORD);
            }
        });

        MimeMessage mimeMessage = new MimeMessage(session);

        try{
            mimeMessage.setFrom(new InternetAddress(Util.EMAIL));
            mimeMessage.addRecipients(Message.RecipientType.TO,String.valueOf(new InternetAddress(email)));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);
            Transport.send(mimeMessage);
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        progressDialog.dismiss();
        startAlertDialog();
        super.onPreExecute();
    }

    private void startAlertDialog() {
        AlertDialog.Builder myDialog = new AlertDialog.Builder(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View myView = inflater.inflate(R.layout.output_layout,null);
        myDialog.setView(myView);

        final AlertDialog dialog = myDialog.create();
        dialog.setCancelable(false);

        Button  closebutton = myView.findViewById(R.id.closebutton);
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
*/