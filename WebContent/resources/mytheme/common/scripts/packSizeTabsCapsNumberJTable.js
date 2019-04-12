/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#PackSizeTabsCapsNumberTableContainer').jtable({
		title : 'Tablet Packet Size',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'PackSizeCode DESC', // Set default sorting
		actions : {
			
				listAction : '/DrugIndex/admin/datatable/getAllPackSizeTabsCapsNumberTableContainer',
				createAction : '/DrugIndex/admin/datatable/addPackSizeTabsCapsNumberTableContainer',
				updateAction : '/DrugIndex/admin/datatable/updatePackSizeTabsCapsNumberTableContainer',
				deleteAction : '/DrugIndex/admin/datatable/deletePackSizeTabsCapsNumberTableContainer'
		},
		fields : {
			PackSizeTabsCapsNumberId: {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			PackSizeCode : {
				title : 'Pack Size Code',
				width : '10%'
			},
			PackSize: {
				title : 'Pack Size',
				width : '20%'
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
	$('#PackSizeTabsCapsNumberTableContainer').jtable('load');

});
