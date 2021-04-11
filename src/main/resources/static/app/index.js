var amin = {
    init : function(){
        var _this=this;
        $('#btn-save').on('click', function(){ _this.save(); } );
        // 버튼id
    },
    // 각 input 상자의 입력 값을 가져와서 변수에 넣기 $('#id명').val()
    save : function(){
        var data = {
                    title : $('#title').val(),
                    author : $('#author').val(),
                    content : $('#content').val()
        };

        // 비동기식 통신
        $.ajax({
            type:'POST',
            url:'/api/v1/posts', // controller mapping 주소
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data:JSON.stringify(data)
            }).done(function(){ // 통신 성공했을 경우
                alert('글 등록 되었습니다');
                window.location.href="/";
            }).fail(function(){ // 통신 실패했을 경우
                alert('글 등록 실패 [관리자 문의]');
            });
    }
}; // 함수 선언

main.init(); // 함수호출