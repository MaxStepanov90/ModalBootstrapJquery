

 $(document).ready(function () {
     console.log('working');
     $('.table .editButton').on('click',function (event) {
         event.preventDefault();
         var href = $(this).attr('href');
         $.get(href, function (nationality, status) {
             $('#IdEdit').val(nationality.id);
             $('#capitalEdit').val(nationality.capital);
             $('#nameEdit').val(nationality.name);
             $('#updateByEdit').val(nationality.updateBy);
             $('#updateOnEdit').val(nationality.updateOn.substring(0,10));
         });
         $('#editModal').modal();
     });
     $('.table .deleteButton').on('click',function (event) {
         event.preventDefault();
         var href = $(this).attr('href');
         $('#deleteModal #deleteId').attr('href',href);
         $('#deleteModal').modal();
     })
 });