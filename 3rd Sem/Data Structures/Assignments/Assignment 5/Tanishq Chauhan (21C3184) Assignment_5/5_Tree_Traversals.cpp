
#include <bits/stdc++.h>
using namespace std;

class node
{
    friend class Tree;
    int data;
    node *leftchild;

    node *rightchild;

public:
    node(node *left = NULL, node *right = NULL, int dat = 0)
    {
        leftchild = left;
        rightchild = right;
        data = dat;
    }
};

class Tree
{
    friend class Iterator;
    node *root;
    void readInorder(node* rot){
        if (rot==NULL)
        {
           return;
        }
     readInorder(rot->leftchild);
     cout<<rot->data<<" ";
     readInorder(rot->rightchild);
        
    }
    void readPreorder(node* rot){
        if(!rot){
            return;
        }
        cout<<rot->data<<" ";
        readPreorder(rot->leftchild);
        readPreorder(rot->rightchild);
    }
    void readPostorder(node* rot){
        if(rot==NULL){
            return;
        }
        readPostorder(rot->leftchild);
        readPostorder(rot->rightchild);
        cout<<rot->data<<" ";
    }

public:
    Tree()
    {
        root = NULL;
    }

    void set(int a)
    {
        if (root == NULL)
        {
            root = new node(NULL, NULL, a);
            return;
        }

        queue<node *> q;
        q.push(root);

        while (!q.empty())
        {
            node *current = q.front();
            q.pop();

            if (current->leftchild != NULL)
            {
                q.push(current->leftchild);
            }
            else
            {
                current->leftchild = new node(NULL, NULL, a);
                return;
            }
            if (current->rightchild != NULL)
            {
                q.push(current->rightchild);
            }

            else
            {
                current->rightchild = new node(NULL, NULL, a);
                return;
            }
        }
    }

   
    
    void readInorder(){
        if(root==NULL){
            cout<<"Tree is empty"<<endl;
            return;
        }
        readInorder(root);
    }
    void readPreorder(){
        if(root==NULL)
        {
            cout<<"Tree is empty\n";
            return;
        }
        readPreorder(root);
    }
    void readPostorder(){
        if(root==NULL){
            cout<<"Tree is empty\n";
            return;
        }
        readPostorder(root);
    }
};


int main(){
    Tree t;
    cout<<"Enter the elements in the tree in linear order\n";
    cout<<"Press -1 to continue\n";
    int key;
    do
    {
        cin>>key;
        if (key!=-1)
        {
           t.set(key);
        }
        
    } while (key!=-1);
    
    cout<<"Preorder sequence of given tree: \n";
    t.readPreorder();
    cout<<"\nInorder sequence of given tree: \n";
    t.readInorder();
    cout<<"\nPostorder sequence of given tree: \n";
    t.readPostorder();
}