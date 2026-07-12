bool isPalindrome(char* s) {
     int len = 0;

    char* c = (char*)malloc(strlen(s) + 1);
    for (int i = 0; s[i] != '\0'; i++) {
        if (isalnum(s[i])) {
            c[len++] = tolower(s[i]);
        }
    }
    c[len] = '\0';

    char* t = (char*)malloc((len + 1));
    int k = 0;
    for (int j = len - 1; j >= 0; j--) {
        t[k++] = c[j];
    }
    t[k] = '\0';

    for (int i = 0; i<len; i++) {
        if (c[i] != t[i]) {
            free(c);
            free(t);
            return false;
        }
    }
    return true;
}