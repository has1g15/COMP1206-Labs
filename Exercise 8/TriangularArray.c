#include <stdio.h>
#include <stdio.h>
#include <stdlib.h>

typedef int** TRIARR;

TRIARR as(int n,int m)
{
    TRIARR as=(int **)malloc(n*sizeof(int*));
    int i;
    for(i=0;i<m;i++) as[i]=(int *)calloc(m-i,sizeof(int));
    return as;
}

//Values stored in array
void triStore(TRIARR as,int N,int M,int row,int col,int val)
{
    if((row<N)&&(col<M))
    {
        if(col-row>=0)
        {
            as[row][col-row]=val;
        }
        else printf("The row and col indices dont belong to the triangular matrix as you used as input\n");
    }
    else printf("The row and col indices dont belong to the triangular matrix as you used as input\n");
}

//Values fetched from array
int triFetch(TRIARR as,int N,int M,int row,int col)
{
    if((row<N)&&(col<M))
    {
        //Checks column number is never less than row number
        if(col-row>=0)
        {
           return as[row][col-row];
        }
        else printf("The row and column indices dont belong to the triangular array\n");
    }
    else printf("The row and column indices dont belong to the triangular array\n");
}

void Show(TRIARR as,int n,int m)
{
    int i=0;
    for(i=0;i<n;i++)
    {
        int j=0;
        for(j=0;j<i;j++) printf("N ");
        for(j=0;j<m-i;j++) printf("%d ",as[i][j]);
        printf("\n");
    }
}

int main()
{
    TRIARR test = as(6,6);
    triStore(test,6,6,3,5,5);
    triFetch(test,6,6,5,3);
    Show(test,6,6);

    printf("the element on row=3 col=5 is val= %d",triFetch(test,6,6,3,5));
    return 0;
}
