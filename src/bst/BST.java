package bst;

public class BST {
    TreeNode root;
    int maxLevel;

    public void addNode(int v) {
        this.root = this._addNode(this.root, v);
    }

    private TreeNode _addNode(TreeNode root, int v) {
        if (root == null) {
            root = new TreeNode(v);
            return root;
        }

        if (v < root.val) {
            root.left = this._addNode(root.left, v);
        } else {
            root.right = this._addNode(root.right, v);
        }

        return root;
    }

    public void printLeftView() {
        this._printLeftView(root, 1);
    }

    private void _printLeftView(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (this.maxLevel < level) {
            System.out.print(root.val + " ");
            this.maxLevel = level;
        }

        this._printLeftView(root.left, level + 1);
        this._printLeftView(root.right, level + 1);
    }

    public int minimumValue() {
        TreeNode curr = this.root;
        while (curr.left != null) {
            curr = curr.left;
        }

        return curr.val;
    }
}
