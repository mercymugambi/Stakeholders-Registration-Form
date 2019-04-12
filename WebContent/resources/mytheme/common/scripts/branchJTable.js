/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#BranchTableContainer').jtable({
		title : 'Branches',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		
		actions : {
			
				listAction : '/ASK/admin/datatable/getAllBranchTableContainer',
				createAction : '/ASK/admin/datatable/addBranchTableContainer',
				updateAction : '/ASK/admin/datatable/updateBranchTableContainer',
				deleteAction : '/ASK/admin/datatable/deleteBranchTableContainer'
		},
		fields : {
			BranchId:{
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			Code : {
				title : 'Branch Code',
				width : '10%'
			},
			Name : {
				title : 'Branch Name',
				width : '70%'
			}
				
			
			

		},
	       //Register to selectionChanged event to hanlde events                                     
        recordAdded: function(event, data){
            //after record insertion, reload the records
            $('#BranchTableContainer').jtable('load');
        },
        recordUpdated: function(event, data){
            //after record updation, reload the records
            $('#BranchTableContainer').jtable('load');
        }
	});
	$('#BranchTableContainer').jtable('load');

});
