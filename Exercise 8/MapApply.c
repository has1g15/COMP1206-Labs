#include <stdio.h>
#include <stdlib.h>

//Declares a type funT that represents the type of a pointer to a function
typedef int (*funT)(int);

int first(int n)
{
    return (n*n+3*n+2);
}
int second(int n)
{
    return (n*n*n+3*n*n+20*n+100);
}
int third(int n)
{
    return (5*n*n*n+152);
}

//Returns a pointer to an array of integers representing the result of applying each function in the array to the value n
int *mapApply( int n, funT fs[] , int size)
{
    int *v=(int *)malloc(size*sizeof(int));
    int i;
    for(i=0;i<size;i++) v[i]=fs[i](n);
    return v;
}

int main()
{
    funT *Vector=(funT *)malloc(3*sizeof(funT));
    Vector[0] = first;
    Vector[1] = second;
    Vector[2] = third;
    int *v=mapApply(3,Vector,3);
    int i;
    for(i=0;i<3;i++)
    {
        printf("%d ",v[i]);
    }
    return 0;
}
