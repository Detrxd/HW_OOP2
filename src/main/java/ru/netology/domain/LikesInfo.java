package ru.netology.domain;

public class LikesInfo {
    private int count; // отображение кол-ва лайков
    private boolean getLike; // лайк установлен пользователем
    private boolean disLike; // лайк не установлен пользователем
    // + get/set на все поля
    private int userLike; // наличие отметки «Мне нравится» от текущего пользователя
}
