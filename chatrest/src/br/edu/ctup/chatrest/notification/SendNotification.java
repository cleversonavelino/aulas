package br.edu.ctup.chatrest.notification;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jettison.json.JSONObject;

import br.edu.ctup.chatrest.entity.Chat;

public class SendNotification {
	
	public void enviar(String token, Chat chat) throws Exception {
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost("https://fcm.googleapis.com/fcm/send");
		post.setHeader("Content-type", "application/json");
		post.setHeader("Authorization", "key=AAAANIf--Lg:APA91bEhLX95qq6QTGaA60iXZvgtps51rcPj7HeMRJhu_0IVGZ4TcI6KTCy3AKxdfRcCi_ectn8cnz97fDPWy0j-1WADeCe8nQlmoCdAE1dXYYsYKp9K3txQW9QX_Q_nJ84y3ap2r3Fh");

		JSONObject message = new JSONObject();
		message.put("to", token);
		message.put("priority", "high");

		JSONObject notification = new JSONObject();
		notification.put("title", chat.getNome());
		notification.put("body", chat.getMensagem());

		message.put("notification", notification);

		post.setEntity(new StringEntity(message.toString(), "UTF-8"));
		HttpResponse response = client.execute(post);
		System.out.println(response);
		System.out.println(message);
	}

}
