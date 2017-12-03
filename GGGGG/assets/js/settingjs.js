/**
 * Created by Administrator on 2017/12/1.
 */
$(function () {
    $.fn.editable.defaults.mode = 'inline';
    $.fn.editableform.loading = "<div class='editableform-loading'><i class='fa fa-spinner'></i></div>";
    $.fn.editableform.buttons = '<button type="submit" class="btn btn-info editable-submit"><i class="fa fa-check"></i></button>'+
        '<button type="button" class="btn editable-cancel"><i class="fa fa-remove"></i></button>';

    $('#userbirthday').editable({
        type: 'date',
        format: 'yyyy-mm-dd',
        viewformat: 'yyyy/mm/dd',
        datepicker: {
            weekStart: 1
        }
    });
    $("#usersex").editable({
        type: 'select',
        value: "male",
        source: [
            {value: "male", text: '男'},
            {value: "female", text: '女'},
        ]
    })


})