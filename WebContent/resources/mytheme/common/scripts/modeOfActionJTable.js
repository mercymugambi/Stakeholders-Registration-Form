/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#ModeOfActionTableContainer').jtable({
		title : 'Table Mode Of Action',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'ModeOfActionCode ASC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllModeOfAction',
			createAction : '/DrugIndex/admin/datatable/addModeOfAction',
			updateAction : '/DrugIndex/admin/datatable/updateModeOfAction',
			deleteAction : '/DrugIndex/admin/datatable/deleteModeOfAction'
		},
		fields : {
			ModeOfActionId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			ModeOfActionCode : {
				title : 'ModeOfActionCode',
				width : '30%'
			},
			ModeOfAction : {
				title : 'ModeOfAction',
				 type : 'textarea',
				width : '100%'
			}

		}
	/*
	 * //Register to selectionChanged event to hanlde events recordAdded:
	 * function(event, data){ //after record insertion, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }, recordUpdated:
	 * function(event, data){ //after record updation, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }
	 */
	});

	$('#LoadRecordsButton2').click(function (e) {
        e.preventDefault();
        $('#ModeOfActionTableContainer').jtable('load', {
            name: $('#name').val()
        });
    });

    //Load all records when page is first shown
    $('#LoadRecordsButton2').click();
});
