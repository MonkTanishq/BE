4#include<iostream>
using namespace std;
int count=0;
int add(char ch[],int k,char h)
{
    k=k+1;
    ch[k]=h;
    count=k;
}
int parent(char ch[],char c){
    int i;
    for(i=0;i<=count;i++)
    {
        if(ch[i]==c)
        {
         
         int k=(i-1)/2;
         
         if(k<0)
         return -1;
         else
         return k;
         break;
        }
    }
     if(i==count)
    return -1;

}
int lchild(char ch[],char c){
    int i;
     for( i=0;i<count;i++)
    {
        if(ch[i]==c)
        {
            
         int k=2*i+1;
         return k;
        
        }
        
    }
    if(i==count)
    return -1;



}
int rchild(char ch[],char c){
    int i;
     for(i=0;i<=count;i++)
    {
        if(ch[i]==c)
        {
         int k=2*i+2;
         return k;
        }
    }
    if(i==count)
    return -1;

} 
void Inorder(char ch[],int i,int count){
    
    if(i>=0&&i<=count)
    {
        Inorder(ch,i*2+1,count);
    cout<<ch[i]<<" ";
    Inorder(ch,i*2+2,count);

    }
    return;
    }
void display(char ch[]){
    for(int i=0;i<=count;i++)
    cout<<ch[i]<<" ";
    cout<<"\n";
}
int main(){
    
    char ch[255];
    for(int i=0;i<255;i++)
    ch[i]='0';
    int n,choice;
    cout<<"Enter the number of nodes in the complete binary tree\n";
    cin>>n;
    cout<<"Enter the elements\n";
    for(int i=0;i<n;i++)
    {cin>>ch[i];}
    count=n-1;
    
    cout<<"Enter 1 to add an element in the binary tree\n";
    cout<<"Enter 2 to delete the last element of Binary tree\n";
    cout<<"Enter 3 to find the node of given element\n";
    cout<<"Enter 4 to find the left child of given element\n";
    cout<<"Enter 5 to find the right child of given element\n";
    cout<<"Enter 6 to display the inorder traversal\n";
     while(choice!=0){
    cout<<"ENTER YOUR CHOICE\n";
    cin>>choice;
   
    switch(choice){
        case 1:
        {   char h;
            
        cout<<"enter the element to added\n";
        cin>>h;
            add(ch,count,h);
            display(ch);}
            break;
            case 2:
            if(count==0)
            cout<<"No element to display\n";
            else
            {count=count-1;
            display(ch);}
            break;
            case 3:
            char h;
            cout<<"enter the element whose node is to be found\n";
            cin>>h;
             if(parent(ch,h)==-1)
            cout<<"NO SUCH ELEMENT EXISTS\n";
            else if(ch[parent(ch,h)]=='0')
            cout<<"NO SUCH NODE EXISTS\n";
            else
            cout<<"Node of given element is: "<<ch[parent(ch,h)]<<"\n";
            break;
            case 4:
             cout<<"enter the element whose lchild is to be found\n";
            cin>>h;
            if(ch[lchild(ch,h)]=='0'||lchild(ch,h)==-1)
            cout<<"NO SUCH ELEMENT EXISTS\n";
            else
              cout<<"Left child of given element is: "<<ch[lchild(ch,h)]<<"\n";
            break;
             case 5:
             cout<<"enter the element whose rchild is to be found\n";
            cin>>h;
           if(ch[rchild(ch,h)]=='0'||rchild(ch,h)==-1)
            cout<<"NO SUCH ELEMENT EXISTS\n";
            else
              cout<<"Right child of given element is: "<<ch[rchild(ch,h)]<<"\n";
            break;
            case 6:Inorder(ch,0,count);
            cout<<"\n";
            break;
            default:cout<<"Enter valid choice\n";
            break;
            
    }
    }

}