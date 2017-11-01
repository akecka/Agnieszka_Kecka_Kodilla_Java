package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){

        theForumUserList.add(new ForumUser('M', 006,"Kevin", 1986,5, 3, 29));
        theForumUserList.add(new ForumUser('M',007,"John", 1985,3, 5, 28));
        theForumUserList.add(new ForumUser('F', 005,"Kasia", 1984,2, 4, 24 ));
        theForumUserList.add(new ForumUser('F',003,"Asia", 1983,1, 3, 20));
        theForumUserList.add(new ForumUser('F', 002, "Jane", 1982,4, 2, 19));
        theForumUserList.add(new ForumUser('M', 001, "Michael",1981, 5, 10, 9));

    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theForumUserList);

    }
}



