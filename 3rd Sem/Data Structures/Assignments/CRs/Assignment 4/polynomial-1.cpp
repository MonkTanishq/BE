#include <bits/stdc++.h>
using namespace std;

class term{
friend class polynomial;
int coeff,expo;
term* next;
public:
term(int coef, int exp, term* next=NULL){
    coeff= coef;
    expo=exp;
    this->next= next;
}
};

class polynomial{
    term* first;
    term* last;

    public:
    polynomial(){
       first =NULL;
      
    }

    void insert(int coef, int exp){
     if (first==NULL)
     {
        first= new term (coef,exp);
      
        return;
     }
     
     term* temp = first;
     while (temp->next!=NULL)
     {
        temp=temp->next;
     }
     term* n = new term(coef,exp);
      temp->next=n;
    }

    void display(){
       term* temp= first;

        while (temp!=NULL)
        {
            cout<<temp->coeff<<" ";
            if(temp->next!=NULL)
            cout<<"x^"<<"("<<temp->expo<<")"<<"+";
        
        temp=temp->next;
        }
    }
    polynomial addition( polynomial b){
        term* apos = first;
        term* bpos = b.first;
        polynomial c;

        while (apos!=NULL&& bpos!=NULL)
        {
            if (apos->expo==bpos->expo)
            {
                int sum = apos->coeff+bpos->coeff;
                if (sum)
                {
                   c.insert(sum,apos->expo);
                }
                apos=apos->next;
                bpos=bpos->next;
            }
            else if (apos->expo>bpos->expo)
            {
                c.insert(apos->coeff,apos->expo);
                apos=apos->next;
            }
            else
            {
                c.insert(bpos->coeff,bpos->expo);
                bpos=bpos->next;
            }
            
        }
        while (apos!=NULL)
        {
            c.insert(apos->coeff, apos->expo);
            apos=apos->next;
        }
        while (bpos!=NULL)
        {
            c.insert(bpos->coeff, bpos->expo);
            bpos=bpos->next;
        }
      return c;  
    }
};

int main(){
    cout<<"enter the degree of 1st polynomial\n";
    int an;
    cin>>an;
    polynomial a;
    cout<<"Enter the coefficients of each term in decreasing order\n";
  for (int i = an; i >= 0; i--)
  {
    int coef;
    cin>>coef;
    a.insert(coef, i);
  }
  cout<<"First polynomial entered above is:\n";
  a.display();
  cout<<endl;
  cout<<"enter the degree of 2nd polynomial\n";
  polynomial b;
  int bn;
  cin>>bn;
  cout<<"Enter the coefficients of each term in decreasing order\n";
 for (int i = bn; i >=0; i--)
 {
     int coef;
     cin>>coef;
     b.insert(coef, i);
 }
 cout<<"Second polynomial entered above is:\n";
 b.display();
 cout<<endl;
 cout<<"After addition the resulting polynomial is :\n";
 polynomial c= a.addition(b);
 c.display();
}


