--https://www.postgresql.org/docs/9.1/sql-createtrigger.html
CREATE TRIGGER error_ins_a INSTEAD OF INSERT ON main_table
FOR EACH ROW EXECUTE PROCEDURE trigger_func('error_ins_a');

