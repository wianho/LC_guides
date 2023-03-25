def preorder(root: TreeNode) -> None:
    if not root: return
    print(root.val)
    preorder(root.left)
    preorder(root.right)

#########################################

def inorder(root: TreeNode) -> None:
    if not root: return
    inorder(root.left)
    print(root.val)
    inorder(root.right)

#########################################

def postorder(root: TreeNode) -> None:
    if not root: return
    postorder(root.left)
    postorder(root.right)
    print(root.val)