package client;

//Не удалось запустить несколько экзепляров одной программы. То, как другие это делают и выкладываю, как делать в чате Инстраграмм наверное работает только для Maven
//Но я не стал заморачиваться Maven'ом, а сделал три ClientApp, их можно по очереди запустить и тестировать работу
//Для удобства в каждом можно подставить логин/пароль пользователя и подключится к серверу
//Много всего сделано, но и много не сделано.
//Корректный выход не реализован, когда пытаещься зайти под тем же логином, под которым уже зашли, когда вводишь не верный пароль и т.д. и т.п., но с кодом я разобрался и сделал достаточно, чтобы вкурить ещё немного Java
//Один раз почему-то как-то криво работал курсор в окошке ввода сообщений - курсор стоял на месте, а текст появлялся справа от курсора, но было это всего один раз

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class ClientApp extends Application {

//    private ServerService serverService;//это переносим в кнопку Войти в чат

    @Override
    public void start(Stage primaryStage) throws Exception {

/*        serverService = new SocketServerService();//это переносим в кнопку Войти в чат
        serverService.openConnection();//Авторизуемся*/

        Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
        primaryStage.setTitle("ИванЧат 2021");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);//Не разрешаем масштабировать
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
