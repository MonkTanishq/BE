#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    char filename[50];
    int field_num;
    printf("Enter the name of the file: ");
    scanf("%s", filename);
    printf("Enter the field number: ");
    scanf("%d", &field_num);
    FILE *fp = fopen(filename, "r");
    if (fp == NULL)
    {
        printf("Error opening file\n");
        return 1;
    }
    char line[100];
    while (fgets(line, 100, fp))
    {
        char *token = strtok(line, " ");
        int field_count = 1;
        while (token != NULL)
        {
            if (field_count == field_num)
            {
                printf("%s\n", token);
                break;
            }
            token = strtok(NULL, " ");
            field_count++;
        }
    }
    fclose(fp);
    return 0;
}
