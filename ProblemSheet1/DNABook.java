// QUESTION4 b): this is the optimal implementation
public class DNABook implements SocialNetwork{
  // same idea as in lecture:
  private Boolean[][] friendsMatrix;
  private String[] nameList;
  private int counter;

  // constructor:
  public DNABook(){
    friendsMatrix = new Boolean[100][100];
    for(int i = 0; i < 100; i++){
      for(int j = 0; j < 100; j++){
        friendsMatrix[i][j] = false;
      }
    }
    nameList = new String[100];
    counter = 0;
  }

  private int getUserNum(String user) {
    // with Binary Search -> logarithmic runtime
    int middle = counter/2;
    String s = nameList[middle];

    while(s.compareTo(user) != 0){
      int i = nameList[middle].compareTo(user);
      if(nameList[middle].compareTo(user) < 0){
        middle = middle + (counter-middle)/2;
        s = nameList[middle];
      }else{
        middle = middle/2;
        s = nameList[middle];
      }
    }
    return middle;
  }


  public void registerUser(String newUser){
    if(counter < 100){
      nameList[counter] = newUser;
      counter++;
    } else {
      System.out.println("DNABook is full!");
    }
  }

  public void becomeFriends(String name1, String name2){
    int user1 = getUserNum(name1);
    int user2 = getUserNum(name2);
    friendsMatrix[user1][user2] = true;
    friendsMatrix[user2][user1] = true;
  }

  public boolean areTheyFriends(String name1, String name2){
    int user1 = getUserNum(name1);
    int user2 = getUserNum(name2);
    Boolean befriended1 = friendsMatrix[user1][user2];
    Boolean befriended2 = friendsMatrix[user2][user1];
    if( (befriended1 == true) && (befriended2 == true) ){
      return true;
    } else {
      return false;
    }
  }
}
