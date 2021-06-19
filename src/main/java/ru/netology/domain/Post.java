package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo comment;
    private Favorite favorite;
    private Geolocation geolocation;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewersInfo viewersInfo;
    private Remove remove;
    private Header header;

    // + getters/setters*
}
