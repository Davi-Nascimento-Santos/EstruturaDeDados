from queue import Queue
ROOT = "root"
class Node:
    def __init__(self, valor):
        self.key = valor
        self.left = None
        self.right = None
    def __str__(self):
        return str(self.key)
class BinarySearchTree:
    def __init__(self):
        self.root = None

    def search(self, value):
        return self._search(value, self.root)

    def _search(self, value, node):
        if node is None:
            return node
        if node.key == value:
            return True
        if value < node.key:
            return self._search(value, node.left)
        return self._search(value, node.right)
    
    #inseri na arvore
    def insert(self, value):
        parent = None
        x = self.root
        while(x):
            parent = x
            if value < x.key:
                x = x.left
            else:
                x = x.right
        if parent is None:
            self.root = Node(value)
        elif value < parent.key:
            parent.left = Node(value)
        else:
            parent.right = Node(value)
    def _preorder_helper(self, node, values):
        if node is not None:
            values.append(node.key)
            self._preorder_helper(node.left, values)
            self._preorder_helper(node.right, values)

    def preorder(self):
        values = []
        self._preorder_helper(self.root, values)
        return values
    
    def postorder_traversal(self, node=None):
        if node is None:
            node = self.root
        if node.left:
            self.postorder_traversal(node.left)
        if node.right:
            self.postorder_traversal(node.right)
        print(node)

    def inorder_traversal(self, node=None):
        if node is None:
            node = self.root
        if node.left:
            self.inorder_traversal(node.left)
        print(node, end=' ')
        if node.right:
            self.inorder_traversal(node.right)
    def levelorder_traversal(self, node=ROOT):
        if node == ROOT:
            node = self.root

        queue = Queue()
        queue.put(node)
        while queue.qsize():
            node = queue.get()
            if node.left:
                queue.put(node.left)
            if node.right:
                queue.put(node.right)
            print(node, end=" ")

    def _ipl_helper(self, node, depth):
        if node is None:
            return 0
        else:
            return depth + self._ipl_helper(node.left, depth+1) + self._ipl_helper(node.right, depth+1)

    def internal_path_length(self):
        return self._ipl_helper(self.root, 0)
    
    def min(self, node=ROOT):
        if node == ROOT:
            node = self.root
        while node.left:
            node = node.left
        return node.key

    def max(self, node=ROOT):
        if node == ROOT:
            node = self.root
        while node.right:
            node = node.right
        return node.key
    
    def height(self, node=None):
        if node is None:
            node = self.root
        hleft = 0
        hright = 0
        if node.left:
            hleft = self.height(node.left)
        if node.right:
            hright = self.height(node.right)
        if hright > hleft:
            return hright + 1
        return hleft + 1

    def _size_helper(self, node):
        if node is None:
            return 0
        else:
            return 1 + self._size_helper(node.left) + self._size_helper(node.right)

    def size(self):
        return self._size_helper(self.root)