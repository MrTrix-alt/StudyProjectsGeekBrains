package ru.chat.network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveString(TCPConnection tcpConnection, String value); // принимает входящую строку
    void onDisconnect(TCPConnection tcpConnection); // метод для обработки события дисконекта
    void onException(TCPConnection tcpConnection, Exception e); // метод для обработки  исключения


}
