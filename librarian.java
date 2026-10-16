class librarian{
    int librarianId;
    String librarianName;
    String librarianEmail;
    int    yearsOfExperience;
    String librarySection;

    librarian(int librarianId,String librarianName,String librarianEmail,int  yearsOfExperience,String librarySection){
    setlibrarianId(librarianId);
    setlibrarianName(librarianName);
    setlibrarianEmail(librarianEmail);
    setyearsOfExperience(yearsOfExperience);
    setlibrarySection(librarySection);
    }

    void setlibrarianId(int librarianId){
        this.librarianId = librarianId;
    }
    void setlibrarianName(String librarianName){
        this.librarianName = librarianName;
    }
    void setlibrarianEmail(String librarianEmail){
        this.librarianEmail = librarianEmail;
    }
    void setyearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    void setlibrarySection(String librarySection){
        this.librarySection = librarySection;
    }

}