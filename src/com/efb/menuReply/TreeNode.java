package com.efb.menuReply;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TreeNode {
    public int id;
    public String title;
    public List<TreeNode> children;
    public Integer parentId ;
    public TreeNode() {
    }

    public TreeNode(String title, int id  ) {
        this.title = title;
        this.id = id;
        this.children = new ArrayList<>();
        this.parentId = null;
    }

    public void addChild(TreeNode node , Integer parentId) {
        node.parentId = parentId;
        this.children.add(node);
    }

    public TreeNode find(int id ,TreeNode root ) {

        AtomicReference<TreeNode> treeNode = new AtomicReference<>(new TreeNode());
        children.stream().forEach(treeNode1 -> {
            if (treeNode1.id == id)
                treeNode.set(treeNode1);
        });
        System.out.println(root.title);
        return treeNode.get();
    }

    public String print(int level) {
        String ret;
        ret = "   ".repeat(level) + title + "\n";
        for (TreeNode node : this.children) {
            ret += node.print(level + 1);
        }
        return ret;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", children=" + children +
                ", parentId=" + parentId +
                '}';
    }
}


