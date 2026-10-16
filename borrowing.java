
class borrowing{
  int borrowingId;
  book book;
  member member;
  librarian librarian;
  int borrowingDays;
  borrowing(int borrowingId, book book,member member,librarian librarian,int borrowingDays){
setborrowingId(borrowingId);
  setbook(book);
  setmember(member);
  setlibrarian(librarian);
  setborrowingDays(borrowingDays);
  }
  void setborrowingId(int borrowingId){
    this.borrowingId = borrowingId;
  }
  void setbook(book book){
    this.book = book;
  }
  void setmember(member member){
    this.member = member;
  }
  void setlibrarian(librarian librarian){
    this.librarian = librarian;
  }
  void setborrowingDays(int borrowingDays){
    this.borrowingDays = borrowingDays;
  }
}

