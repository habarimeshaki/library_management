class member{
    int memberId;
    String memberName;
    String memberEmail;
    int memberAge;
    String membershipType;

    member(int memberId,String memberName,String memberEmail,int memberAge,String membershipType){
        setmemberId(memberId);
        setmemberName(memberName);
        setmemberEmail(memberEmail);
        setmemberAge(memberAge);
        setmembershipType(membershipType);
    }
    void setmemberId(int memberId){
        this.memberId = memberId;
    }
    void setmemberName(String memberName){
            this.memberName = memberName;
        }
    void setmemberEmail(String memberEmail){
        this.memberEmail = memberEmail;
    }
    void setmemberAge(int memberAge){
        this.memberAge = memberAge;
    }
    void setmembershipType(String membershipType){
        this.membershipType = membershipType;
        }
}