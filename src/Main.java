public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(125,15,TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(25,5,TreeType.MAPLE);
        System.out.println(myFavoriteMapleTree.getTreeType());
        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());
        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();
        Tree.announceTree();
    }
}