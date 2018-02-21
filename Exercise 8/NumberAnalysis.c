#include <stdio.h>
#include <math.h>
#include <stdlib.h>

//Function returning sign of the d, whole part of the d and fractional part
int analyse(int *wholePtr , double *fracPtr, double d)
{
    *wholePtr = (int)d;
    *fracPtr = d - *wholePtr;

    //Returns the sign
    if(d > 0)
    {
        return 1;
    }
    else if(d < 0)
    {
        return -1;
    }
    return 0;
}

int main(void)
{
    //Function called with a double example
    double d = 11.33, *fracPtr = malloc(sizeof(double));
    int *wholePtr =  malloc(sizeof(int));
    int Analyse = analyse(wholePtr, fracPtr, d);

    //Results printed to stdout
    printf("%d %d %f ", Analyse, *wholePtr, *fracPtr);

    //Memory freed up
    free(wholePtr);
    free(fracPtr);
    return 0;
}


